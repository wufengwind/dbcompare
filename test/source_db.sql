-- ===============================================
-- 源数据库 (source_db) 测试脚本
-- 包含各种类型的数据库对象用于测试比较功能
-- ===============================================

-- 创建数据库
CREATE DATABASE IF NOT EXISTS source_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE source_db;

-- ===============================================
-- 1. 数据表 (TABLES) - 相同和不同的表
-- ===============================================

-- 相同的表 - 在两个数据库中完全相同
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 相同的表结构但有细微差异
CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    category_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 只存在于源数据库的表
CREATE TABLE source_only_table (
    id INT PRIMARY KEY AUTO_INCREMENT,
    data VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 不同结构的表
CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL DEFAULT 1,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) DEFAULT 'pending',
    total_amount DECIMAL(10,2),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

-- 带有更多字段的表
CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description TEXT,
    parent_id INT,
    sort_order INT DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- ===============================================
-- 2. 索引 (INDEXES) - 相同和不同的索引
-- ===============================================

-- 相同的索引
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_products_category ON products(category_id);

-- 只存在于源数据库的索引
CREATE INDEX idx_source_only ON products(name);
CREATE INDEX idx_orders_user_date ON orders(user_id, order_date);

-- 复合索引
CREATE INDEX idx_orders_status_date ON orders(status, order_date);

-- ===============================================
-- 3. 视图 (VIEWS) - 相同和不同的视图
-- ===============================================

-- 相同的视图
CREATE VIEW active_users AS
SELECT id, username, email, created_at
FROM users
WHERE created_at >= DATE_SUB(NOW(), INTERVAL 30 DAY);

-- 不同的视图 (SQL略有差异)
CREATE VIEW order_summary AS
SELECT 
    o.id,
    u.username,
    p.name as product_name,
    o.quantity,
    o.total_amount,
    o.order_date,
    o.status
FROM orders o
JOIN users u ON o.user_id = u.id
JOIN products p ON o.product_id = p.id
WHERE o.status != 'cancelled';

-- 只存在于源数据库的视图
CREATE VIEW source_only_view AS
SELECT 
    c.name as category_name,
    COUNT(p.id) as product_count,
    AVG(p.price) as avg_price
FROM categories c
LEFT JOIN products p ON c.id = p.category_id
WHERE c.is_active = TRUE
GROUP BY c.id, c.name;

-- ===============================================
-- 4. 存储过程 (PROCEDURES) - 相同和不同的过程
-- ===============================================

DELIMITER //

-- 相同的存储过程
CREATE PROCEDURE GetUserById(IN userId INT)
BEGIN
    SELECT id, username, email, created_at
    FROM users
    WHERE id = userId;
END //

-- 不同的存储过程 (逻辑略有差异)
CREATE PROCEDURE CreateOrder(
    IN p_user_id INT,
    IN p_product_id INT,
    IN p_quantity INT
)
BEGIN
    DECLARE v_price DECIMAL(10,2);
    DECLARE v_total DECIMAL(10,2);
    
    -- 获取产品价格
    SELECT price INTO v_price FROM products WHERE id = p_product_id;
    SET v_total = v_price * p_quantity;
    
    -- 创建订单
    INSERT INTO orders (user_id, product_id, quantity, total_amount)
    VALUES (p_user_id, p_product_id, p_quantity, v_total);
    
    SELECT LAST_INSERT_ID() as order_id;
END //

-- 只存在于源数据库的存储过程
CREATE PROCEDURE SourceOnlyProcedure(IN categoryId INT)
BEGIN
    SELECT p.id, p.name, p.price
    FROM products p
    WHERE p.category_id = categoryId
    ORDER BY p.price DESC;
END //

-- ===============================================
-- 5. 函数 (FUNCTIONS) - 相同和不同的函数
-- ===============================================

-- 相同的函数
CREATE FUNCTION GetDiscountedPrice(originalPrice DECIMAL(10,2), discountPercent INT)
RETURNS DECIMAL(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    RETURN originalPrice * (100 - discountPercent) / 100;
END //

-- 不同的函数 (计算逻辑略有差异)
CREATE FUNCTION CalculateOrderTotal(orderId INT)
RETURNS DECIMAL(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE total DECIMAL(10,2) DEFAULT 0;
    
    SELECT quantity * (SELECT price FROM products WHERE id = product_id)
    INTO total
    FROM orders
    WHERE id = orderId;
    
    RETURN IFNULL(total, 0);
END //

-- 只存在于源数据库的函数
CREATE FUNCTION SourceOnlyFunction(input_text VARCHAR(255))
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
    RETURN CONCAT('Source: ', UPPER(input_text));
END //

-- ===============================================
-- 6. 触发器 (TRIGGERS) - 相同和不同的触发器
-- ===============================================

-- 相同的触发器
CREATE TRIGGER users_updated_at
    BEFORE UPDATE ON users
    FOR EACH ROW
BEGIN
    SET NEW.updated_at = CURRENT_TIMESTAMP;
END //

-- 不同的触发器 (逻辑略有差异)
CREATE TRIGGER orders_audit
    AFTER INSERT ON orders
    FOR EACH ROW
BEGIN
    INSERT INTO source_only_table (data)
    VALUES (CONCAT('New order created: ', NEW.id, ' for user: ', NEW.user_id));
END //

-- 只存在于源数据库的触发器
CREATE TRIGGER source_only_trigger
    BEFORE DELETE ON products
    FOR EACH ROW
BEGIN
    INSERT INTO source_only_table (data)
    VALUES (CONCAT('Product deleted: ', OLD.name));
END //

DELIMITER ;

-- ===============================================
-- 7. 插入测试数据
-- ===============================================

-- 用户数据
INSERT INTO users (username, email) VALUES
('john_doe', 'john@example.com'),
('jane_smith', 'jane@example.com'),
('bob_wilson', 'bob@example.com'),
('alice_brown', 'alice@example.com');

-- 分类数据
INSERT INTO categories (name, description, sort_order) VALUES
('Electronics', '电子产品', 1),
('Books', '图书', 2),
('Clothing', '服装', 3),
('Home & Garden', '家居园艺', 4);

-- 产品数据
INSERT INTO products (name, description, price, category_id) VALUES
('iPhone 15', '最新款苹果手机', 999.99, 1),
('MacBook Pro', '专业笔记本电脑', 1999.99, 1),
('Java编程思想', '经典编程书籍', 79.99, 2),
('Spring Boot实战', 'Spring Boot开发指南', 59.99, 2),
('牛仔裤', '经典蓝色牛仔裤', 49.99, 3),
('T恤衫', '纯棉T恤', 19.99, 3);

-- 订单数据
INSERT INTO orders (user_id, product_id, quantity, total_amount, status) VALUES
(1, 1, 1, 999.99, 'completed'),
(2, 3, 2, 159.98, 'completed'),
(3, 5, 1, 49.99, 'pending'),
(4, 2, 1, 1999.99, 'shipped'),
(1, 4, 1, 59.99, 'completed');

-- ===============================================
-- 8. 约束 (CONSTRAINTS) - 额外的约束
-- ===============================================

-- 添加检查约束
ALTER TABLE products ADD CONSTRAINT chk_price_positive CHECK (price > 0);
ALTER TABLE orders ADD CONSTRAINT chk_quantity_positive CHECK (quantity > 0);

-- 添加唯一约束
ALTER TABLE categories ADD CONSTRAINT uk_category_name UNIQUE (name);

-- ===============================================
-- 显示创建完成信息
-- ===============================================
SELECT '源数据库 (source_db) 创建完成!' as message;
SELECT 
    COUNT(*) as table_count,
    'tables created' as description
FROM information_schema.tables 
WHERE table_schema = 'source_db' AND table_type = 'BASE TABLE';

SELECT 
    COUNT(*) as view_count,
    'views created' as description
FROM information_schema.views 
WHERE table_schema = 'source_db';

SELECT 
    COUNT(*) as procedure_count,
    'procedures created' as description
FROM information_schema.routines 
WHERE routine_schema = 'source_db' AND routine_type = 'PROCEDURE';

SELECT 
    COUNT(*) as function_count,
    'functions created' as description
FROM information_schema.routines 
WHERE routine_schema = 'source_db' AND routine_type = 'FUNCTION'; 