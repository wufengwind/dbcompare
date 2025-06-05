-- SQL Server Target Database Test Script
-- 创建与源数据库有差异的数据库结构用于测试比较

USE master;
GO

-- 创建数据库 (如果不存在)
IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'ecommerce_target')
BEGIN
    CREATE DATABASE ecommerce_target;
END
GO

USE ecommerce_target;
GO

-- 删除已存在的对象
IF OBJECT_ID('orders', 'U') IS NOT NULL DROP TABLE orders;
IF OBJECT_ID('customer_reviews', 'U') IS NOT NULL DROP TABLE customer_reviews;
IF OBJECT_ID('products', 'U') IS NOT NULL DROP TABLE products;
IF OBJECT_ID('categories', 'U') IS NOT NULL DROP TABLE categories;
IF OBJECT_ID('users', 'U') IS NOT NULL DROP TABLE users;
IF OBJECT_ID('target_only_table', 'U') IS NOT NULL DROP TABLE target_only_table;
GO

-- 1. 用户表 (有差异)
CREATE TABLE users (
    user_id INT IDENTITY(1,1) PRIMARY KEY,
    username NVARCHAR(50) NOT NULL UNIQUE,
    email NVARCHAR(100) NOT NULL,
    password_hash NVARCHAR(255) NOT NULL,
    first_name NVARCHAR(50),
    last_name NVARCHAR(50),
    phone NVARCHAR(20),
    birth_date DATE,  -- 新增字段
    country NVARCHAR(50) DEFAULT 'China',  -- 新增字段
    created_at DATETIME2 DEFAULT GETDATE(),
    updated_at DATETIME2 DEFAULT GETDATE(),
    is_active BIT DEFAULT 1
);

-- 2. 商品分类表 (相同)
CREATE TABLE categories (
    category_id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(100) NOT NULL,
    description NVARCHAR(500),
    parent_id INT,
    created_at DATETIME2 DEFAULT GETDATE(),
    CONSTRAINT fk_category_parent FOREIGN KEY (parent_id) REFERENCES categories(category_id)
);

-- 3. 商品表 (有差异)
CREATE TABLE products (
    product_id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(200) NOT NULL,
    description NTEXT,
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    cost_price DECIMAL(10,2) CHECK (cost_price >= 0),
    stock_quantity INT DEFAULT 0 CHECK (stock_quantity >= 0),
    min_stock_level INT DEFAULT 10,  -- 新增字段
    category_id INT,
    sku NVARCHAR(50) UNIQUE,
    brand NVARCHAR(100),  -- 新增字段
    weight DECIMAL(8,2),  -- 新增字段
    status NVARCHAR(20) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE', 'INACTIVE', 'DISCONTINUED')),
    created_at DATETIME2 DEFAULT GETDATE(),
    updated_at DATETIME2 DEFAULT GETDATE(),
    CONSTRAINT fk_product_category FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- 4. 订单表 (缺少字段)
CREATE TABLE orders (
    order_id INT IDENTITY(1,1) PRIMARY KEY,
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL CHECK (quantity > 0),
    unit_price DECIMAL(10,2) NOT NULL CHECK (unit_price >= 0),
    total_amount DECIMAL(10,2) NOT NULL CHECK (total_amount >= 0),
    order_status NVARCHAR(20) DEFAULT 'PENDING' CHECK (order_status IN ('PENDING', 'CONFIRMED', 'SHIPPED', 'DELIVERED', 'CANCELLED')),
    order_date DATETIME2 DEFAULT GETDATE(),
    -- 缺少 shipping_address 和 notes 字段
    CONSTRAINT fk_order_user FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT fk_order_product FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 5. 客户评价表 (仅目标数据库)
CREATE TABLE customer_reviews (
    review_id INT IDENTITY(1,1) PRIMARY KEY,
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    rating INT CHECK (rating BETWEEN 1 AND 5),
    review_text NTEXT,
    review_date DATETIME2 DEFAULT GETDATE(),
    is_verified BIT DEFAULT 0,
    CONSTRAINT fk_review_user FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT fk_review_product FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 6. 仅目标数据库表
CREATE TABLE target_only_table (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(100),
    value DECIMAL(10,2),
    created_at DATETIME2 DEFAULT GETDATE()
);
GO

-- 创建索引 (有差异)
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_users_username ON users(username);
CREATE INDEX idx_users_country ON users(country);  -- 新增索引
CREATE INDEX idx_products_category ON products(category_id);
CREATE INDEX idx_products_brand ON products(brand);  -- 新增索引
CREATE INDEX idx_products_stock ON products(stock_quantity);  -- 新增索引
CREATE INDEX idx_orders_user_product ON orders(user_id, product_id);  -- 不同的组合索引
CREATE INDEX idx_reviews_rating ON customer_reviews(rating);
CREATE INDEX idx_reviews_user ON customer_reviews(user_id);
CREATE INDEX idx_reviews_product ON customer_reviews(product_id);
CREATE INDEX idx_target_only ON target_only_table(name);
GO

-- 创建唯一约束
ALTER TABLE categories ADD CONSTRAINT uk_category_name UNIQUE (name);
GO

-- 创建视图
CREATE VIEW active_users AS
SELECT user_id, username, email, first_name, last_name, phone, country, created_at
FROM users 
WHERE is_active = 1;
GO

CREATE VIEW order_summary AS
SELECT 
    o.order_id,
    u.username,
    p.name AS product_name,
    o.quantity,
    o.unit_price,
    o.total_amount,
    o.order_status,
    o.order_date
FROM orders o
INNER JOIN users u ON o.user_id = u.user_id
INNER JOIN products p ON o.product_id = p.product_id;
GO

CREATE VIEW popular_products AS
SELECT 
    p.product_id,
    p.name,
    COUNT(o.order_id) AS order_count,
    AVG(CAST(cr.rating AS FLOAT)) AS avg_rating
FROM products p
LEFT JOIN orders o ON p.product_id = o.product_id
LEFT JOIN customer_reviews cr ON p.product_id = cr.product_id
GROUP BY p.product_id, p.name;
GO

CREATE VIEW target_only_view AS
SELECT id, name, value * 1.08 AS value_with_tax
FROM target_only_table;
GO

-- 创建存储过程
CREATE PROCEDURE GetUserById
    @user_id INT
AS
BEGIN
    SET NOCOUNT ON;
    
    SELECT user_id, username, email, first_name, last_name, country
    FROM users
    WHERE user_id = @user_id;
END;
GO

CREATE PROCEDURE CreateOrder
    @user_id INT,
    @product_id INT,
    @quantity INT,
    @unit_price DECIMAL(10,2),
    @order_id INT OUTPUT
AS
BEGIN
    SET NOCOUNT ON;
    
    DECLARE @total DECIMAL(10,2);
    DECLARE @stock INT;
    
    -- 检查库存
    SELECT @stock = stock_quantity
    FROM products
    WHERE product_id = @product_id;
    
    IF @stock < @quantity
    BEGIN
        RAISERROR('Insufficient stock', 16, 1);
        RETURN;
    END
    
    SET @total = @quantity * @unit_price;
    
    INSERT INTO orders (user_id, product_id, quantity, unit_price, total_amount)
    VALUES (@user_id, @product_id, @quantity, @unit_price, @total);
    
    SET @order_id = SCOPE_IDENTITY();
    
    -- 更新库存
    UPDATE products 
    SET stock_quantity = stock_quantity - @quantity
    WHERE product_id = @product_id;
END;
GO

CREATE PROCEDURE UpdateProductStock
    @product_id INT,
    @new_stock INT
AS
BEGIN
    SET NOCOUNT ON;
    
    UPDATE products 
    SET stock_quantity = @new_stock,
        updated_at = GETDATE()
    WHERE product_id = @product_id;
END;
GO

CREATE PROCEDURE TargetOnlyProcedure
    @id INT,
    @value DECIMAL(10,2)
AS
BEGIN
    SET NOCOUNT ON;
    
    UPDATE target_only_table 
    SET value = @value 
    WHERE id = @id;
END;
GO

-- 创建函数
CREATE FUNCTION CalculateOrderTotal(@order_id INT)
RETURNS DECIMAL(10,2)
AS
BEGIN
    DECLARE @total DECIMAL(10,2);
    
    SELECT @total = total_amount
    FROM orders
    WHERE order_id = @order_id;
    
    RETURN ISNULL(@total, 0);
END;
GO

CREATE FUNCTION GetDiscountedPrice(@price DECIMAL(10,2), @discount_rate DECIMAL(3,2) = 0.15)
RETURNS DECIMAL(10,2)
AS
BEGIN
    RETURN @price * (1 - @discount_rate);
END;
GO

CREATE FUNCTION GetProductAverageRating(@product_id INT)
RETURNS DECIMAL(3,2)
AS
BEGIN
    DECLARE @avg_rating DECIMAL(3,2);
    
    SELECT @avg_rating = AVG(CAST(rating AS DECIMAL(3,2)))
    FROM customer_reviews
    WHERE product_id = @product_id;
    
    RETURN ISNULL(@avg_rating, 0);
END;
GO

CREATE FUNCTION TargetOnlyFunction(@input NVARCHAR(100))
RETURNS NVARCHAR(200)
AS
BEGIN
    RETURN 'Target: ' + UPPER(@input);
END;
GO

-- 创建触发器
CREATE TRIGGER users_updated_at
ON users
AFTER UPDATE
AS
BEGIN
    SET NOCOUNT ON;
    
    UPDATE users 
    SET updated_at = GETDATE()
    FROM users u
    INNER JOIN inserted i ON u.user_id = i.user_id;
END;
GO

CREATE TRIGGER orders_audit
ON orders
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    SET NOCOUNT ON;
    
    DECLARE @action NVARCHAR(10);
    
    IF EXISTS(SELECT * FROM inserted) AND EXISTS(SELECT * FROM deleted)
        SET @action = 'UPDATE';
    ELSE IF EXISTS(SELECT * FROM inserted)
        SET @action = 'INSERT';
    ELSE
        SET @action = 'DELETE';
    
    -- 这里可以记录到审计表
    -- INSERT INTO audit_log (table_name, action, timestamp) VALUES ('orders', @action, GETDATE());
END;
GO

CREATE TRIGGER review_validation
ON customer_reviews
INSTEAD OF INSERT, UPDATE
AS
BEGIN
    SET NOCOUNT ON;
    
    IF EXISTS(SELECT * FROM inserted WHERE rating IS NOT NULL AND (rating < 1 OR rating > 5))
    BEGIN
        RAISERROR('Rating must be between 1 and 5', 16, 1);
        RETURN;
    END
    
    INSERT INTO customer_reviews (user_id, product_id, rating, review_text, review_date, is_verified)
    SELECT user_id, product_id, rating, review_text, ISNULL(review_date, GETDATE()), is_verified
    FROM inserted;
END;
GO

CREATE TRIGGER target_only_trigger
ON target_only_table
INSTEAD OF INSERT
AS
BEGIN
    SET NOCOUNT ON;
    
    INSERT INTO target_only_table (name, value, created_at)
    SELECT name, value, ISNULL(created_at, GETDATE())
    FROM inserted;
END;
GO

-- 插入测试数据
INSERT INTO categories (name, description) VALUES ('电子产品', '各类电子设备');
INSERT INTO categories (name, description) VALUES ('服装', '男女服装');
INSERT INTO categories (name, description) VALUES ('图书', '各类书籍');
INSERT INTO categories (name, description) VALUES ('家居用品', '家庭生活用品');

INSERT INTO users (username, email, password_hash, first_name, last_name, phone, country) VALUES 
('john_doe', 'john@example.com', 'hash123', 'John', 'Doe', '1234567890', 'USA');
INSERT INTO users (username, email, password_hash, first_name, last_name, phone, country) VALUES 
('jane_smith', 'jane@example.com', 'hash456', 'Jane', 'Smith', '0987654321', 'Canada');
INSERT INTO users (username, email, password_hash, first_name, last_name, phone, country) VALUES 
('bob_wilson', 'bob@example.com', 'hash789', 'Bob', 'Wilson', '5555555555', 'China');

INSERT INTO products (name, description, price, cost_price, stock_quantity, min_stock_level, category_id, sku, brand, weight) VALUES 
('iPhone 15', '最新款iPhone', 999.99, 700.00, 50, 10, 1, 'IP15-001', 'Apple', 0.2);
INSERT INTO products (name, description, price, cost_price, stock_quantity, min_stock_level, category_id, sku, brand, weight) VALUES 
('MacBook Pro', '专业笔记本电脑', 2499.99, 1800.00, 20, 5, 1, 'MBP-001', 'Apple', 2.0);
INSERT INTO products (name, description, price, cost_price, stock_quantity, min_stock_level, category_id, sku, brand, weight) VALUES 
('Samsung Galaxy S24', 'Android旗舰手机', 899.99, 600.00, 30, 8, 1, 'SGS24-001', 'Samsung', 0.18);

INSERT INTO customer_reviews (user_id, product_id, rating, review_text) VALUES 
(1, 1, 5, '非常棒的手机！');
INSERT INTO customer_reviews (user_id, product_id, rating, review_text) VALUES 
(2, 2, 4, '性能很好，价格有点贵');

INSERT INTO target_only_table (name, value) VALUES ('Target Item', 100.50);
INSERT INTO target_only_table (name, value) VALUES ('Another Item', 250.75);

-- 显示创建的对象统计
SELECT 'Tables' AS object_type, COUNT(*) AS count 
FROM sys.tables
UNION ALL
SELECT 'Views', COUNT(*) 
FROM sys.views
UNION ALL
SELECT 'Procedures', COUNT(*) 
FROM sys.procedures
UNION ALL
SELECT 'Functions', COUNT(*) 
FROM sys.objects WHERE type IN ('FN', 'IF', 'TF')
UNION ALL
SELECT 'Triggers', COUNT(*) 
FROM sys.triggers
UNION ALL
SELECT 'Indexes', COUNT(*) 
FROM sys.indexes WHERE type > 0 AND is_primary_key = 0 AND is_unique_constraint = 0;

PRINT 'SQL Server Target Database created successfully!'; 