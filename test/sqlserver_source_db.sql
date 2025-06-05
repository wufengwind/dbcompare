-- SQL Server Source Database Test Script
-- 创建模拟电商系统的数据库结构

USE master;
GO

-- 创建数据库 (如果不存在)
IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'ecommerce_source')
BEGIN
    CREATE DATABASE ecommerce_source;
END
GO

USE ecommerce_source;
GO

-- 删除已存在的对象
IF OBJECT_ID('orders', 'U') IS NOT NULL DROP TABLE orders;
IF OBJECT_ID('products', 'U') IS NOT NULL DROP TABLE products;
IF OBJECT_ID('categories', 'U') IS NOT NULL DROP TABLE categories;
IF OBJECT_ID('users', 'U') IS NOT NULL DROP TABLE users;
IF OBJECT_ID('source_only_table', 'U') IS NOT NULL DROP TABLE source_only_table;
GO

-- 1. 用户表
CREATE TABLE users (
    user_id INT IDENTITY(1,1) PRIMARY KEY,
    username NVARCHAR(50) NOT NULL UNIQUE,
    email NVARCHAR(100) NOT NULL,
    password_hash NVARCHAR(255) NOT NULL,
    first_name NVARCHAR(50),
    last_name NVARCHAR(50),
    phone NVARCHAR(20),
    created_at DATETIME2 DEFAULT GETDATE(),
    updated_at DATETIME2 DEFAULT GETDATE(),
    is_active BIT DEFAULT 1
);

-- 2. 商品分类表
CREATE TABLE categories (
    category_id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(100) NOT NULL,
    description NVARCHAR(500),
    parent_id INT,
    created_at DATETIME2 DEFAULT GETDATE(),
    CONSTRAINT fk_category_parent FOREIGN KEY (parent_id) REFERENCES categories(category_id)
);

-- 3. 商品表
CREATE TABLE products (
    product_id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(200) NOT NULL,
    description NTEXT,
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    cost_price DECIMAL(10,2) CHECK (cost_price >= 0),
    stock_quantity INT DEFAULT 0 CHECK (stock_quantity >= 0),
    category_id INT,
    sku NVARCHAR(50) UNIQUE,
    status NVARCHAR(20) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE', 'INACTIVE', 'DISCONTINUED')),
    created_at DATETIME2 DEFAULT GETDATE(),
    updated_at DATETIME2 DEFAULT GETDATE(),
    CONSTRAINT fk_product_category FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- 4. 订单表
CREATE TABLE orders (
    order_id INT IDENTITY(1,1) PRIMARY KEY,
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL CHECK (quantity > 0),
    unit_price DECIMAL(10,2) NOT NULL CHECK (unit_price >= 0),
    total_amount DECIMAL(10,2) NOT NULL CHECK (total_amount >= 0),
    order_status NVARCHAR(20) DEFAULT 'PENDING' CHECK (order_status IN ('PENDING', 'CONFIRMED', 'SHIPPED', 'DELIVERED', 'CANCELLED')),
    order_date DATETIME2 DEFAULT GETDATE(),
    shipping_address NVARCHAR(500),
    notes NVARCHAR(1000),
    CONSTRAINT fk_order_user FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT fk_order_product FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 5. 仅源数据库表
CREATE TABLE source_only_table (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(100),
    description NVARCHAR(500),
    created_at DATETIME2 DEFAULT GETDATE()
);
GO

-- 创建索引
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_users_username ON users(username);
CREATE INDEX idx_products_category ON products(category_id);
CREATE INDEX idx_products_sku ON products(sku);
CREATE INDEX idx_orders_user_date ON orders(user_id, order_date);
CREATE INDEX idx_orders_status_date ON orders(order_status, order_date);
CREATE INDEX idx_source_only ON source_only_table(name);
GO

-- 创建唯一约束
ALTER TABLE categories ADD CONSTRAINT uk_category_name UNIQUE (name);
GO

-- 创建视图
CREATE VIEW active_users AS
SELECT user_id, username, email, first_name, last_name, phone, created_at
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

CREATE VIEW source_only_view AS
SELECT id, name, UPPER(description) AS description
FROM source_only_table;
GO

-- 创建存储过程
CREATE PROCEDURE GetUserById
    @user_id INT
AS
BEGIN
    SET NOCOUNT ON;
    
    SELECT user_id, username, email, first_name, last_name
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
    SET @total = @quantity * @unit_price;
    
    INSERT INTO orders (user_id, product_id, quantity, unit_price, total_amount)
    VALUES (@user_id, @product_id, @quantity, @unit_price, @total);
    
    SET @order_id = SCOPE_IDENTITY();
END;
GO

CREATE PROCEDURE SourceOnlyProcedure
    @id INT
AS
BEGIN
    SET NOCOUNT ON;
    
    UPDATE source_only_table 
    SET description = 'Updated by procedure' 
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

CREATE FUNCTION GetDiscountedPrice(@price DECIMAL(10,2), @discount_rate DECIMAL(3,2) = 0.1)
RETURNS DECIMAL(10,2)
AS
BEGIN
    RETURN @price * (1 - @discount_rate);
END;
GO

CREATE FUNCTION SourceOnlyFunction(@input NVARCHAR(100))
RETURNS NVARCHAR(200)
AS
BEGIN
    RETURN 'Source: ' + @input;
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

CREATE TRIGGER source_only_trigger
ON source_only_table
INSTEAD OF INSERT
AS
BEGIN
    SET NOCOUNT ON;
    
    INSERT INTO source_only_table (name, description, created_at)
    SELECT name, description, ISNULL(created_at, GETDATE())
    FROM inserted;
END;
GO

-- 插入测试数据
INSERT INTO categories (name, description) VALUES ('电子产品', '各类电子设备');
INSERT INTO categories (name, description) VALUES ('服装', '男女服装');
INSERT INTO categories (name, description) VALUES ('图书', '各类书籍');

INSERT INTO users (username, email, password_hash, first_name, last_name, phone) VALUES 
('john_doe', 'john@example.com', 'hash123', 'John', 'Doe', '1234567890');
INSERT INTO users (username, email, password_hash, first_name, last_name, phone) VALUES 
('jane_smith', 'jane@example.com', 'hash456', 'Jane', 'Smith', '0987654321');

INSERT INTO products (name, description, price, cost_price, stock_quantity, category_id, sku) VALUES 
('iPhone 15', '最新款iPhone', 999.99, 700.00, 50, 1, 'IP15-001');
INSERT INTO products (name, description, price, cost_price, stock_quantity, category_id, sku) VALUES 
('MacBook Pro', '专业笔记本电脑', 2499.99, 1800.00, 20, 1, 'MBP-001');

INSERT INTO source_only_table (name, description) VALUES ('Test Item', 'Only in source');

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

PRINT 'SQL Server Source Database created successfully!'; 