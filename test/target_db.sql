-- ===============================================
-- 目标数据库 (target_db) 测试脚本
-- 包含各种类型的数据库对象用于测试比较功能
-- 与源数据库有相同、不同和独有的对象
-- ===============================================

-- 创建数据库
CREATE DATABASE IF NOT EXISTS target_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE target_db;

-- ===============================================
-- 1. 数据表 (TABLES) - 相同和不同的表
-- ===============================================

-- 相同的表 - 与源数据库完全相同
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 不同的表结构 - 多了字段
CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    category_id INT,
    stock_quantity INT DEFAULT 0,  -- 新增字段
    is_active BOOLEAN DEFAULT TRUE, -- 新增字段
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- 新增字段
);

-- 只存在于目标数据库的表
CREATE TABLE target_only_table (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    value DECIMAL(10,2),
    metadata JSON,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 不同结构的表 - 缺少一些字段
CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL DEFAULT 1,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    -- 注意：缺少 status 和 total_amount 字段
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

-- 完全不同的表结构
CREATE TABLE categories (
    category_id INT PRIMARY KEY AUTO_INCREMENT,  -- 字段名不同
    category_name VARCHAR(100) NOT NULL,        -- 字段名和长度不同
    parent_category_id INT,                     -- 字段名不同
    display_order INT DEFAULT 0,               -- 字段名不同
    active_flag TINYINT(1) DEFAULT 1,          -- 字段名和类型不同
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- 字段名不同
    modify_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  -- 字段名不同
);

-- 目标数据库独有的表
CREATE TABLE customer_reviews (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT NOT NULL,
    user_id INT NOT NULL,
    rating INT NOT NULL CHECK (rating >= 1 AND rating <= 5),
    review_text TEXT,
    helpful_count INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- ===============================================
-- 2. 索引 (INDEXES) - 相同和不同的索引
-- ===============================================

-- 相同的索引
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_products_category ON products(category_id);

-- 只存在于目标数据库的索引
CREATE INDEX idx_target_only ON products(is_active);
CREATE INDEX idx_reviews_rating ON customer_reviews(rating);
CREATE INDEX idx_products_stock ON products(stock_quantity);

-- 不同的复合索引
CREATE INDEX idx_orders_user_product ON orders(user_id, product_id); -- 与源数据库的索引字段不同

-- ===============================================
-- 3. 视图 (VIEWS) - 相同和不同的视图
-- ===============================================

-- 相同的视图
CREATE VIEW active_users AS
SELECT id, username, email, created_at
FROM users
WHERE created_at >= DATE_SUB(NOW(), INTERVAL 30 DAY);

-- 不同的视图 (SQL有差异)
CREATE VIEW order_summary AS
SELECT 
    o.id,
    u.username,
    p.name as product_name,
    o.quantity,
    p.price * o.quantity as calculated_total, -- 计算方式不同
    o.order_date
    -- 注意：缺少 status 字段
FROM orders o
JOIN users u ON o.user_id = u.id
JOIN products p ON o.product_id = p.id;

-- 只存在于目标数据库的视图
CREATE VIEW target_only_view AS
SELECT 
    p.id,
    p.name,
    p.price,
    p.stock_quantity,
    c.category_name,
    COALESCE(AVG(r.rating), 0) as avg_rating,
    COUNT(r.id) as review_count
FROM products p
LEFT JOIN categories c ON p.category_id = c.category_id
LEFT JOIN customer_reviews r ON p.id = r.product_id
WHERE p.is_active = TRUE
GROUP BY p.id, p.name, p.price, p.stock_quantity, c.category_name;

-- 完全不同的视图
CREATE VIEW popular_products AS
SELECT 
    p.name,
    p.price,
    COUNT(o.id) as order_count,
    SUM(o.quantity) as total_sold
FROM products p
LEFT JOIN orders o ON p.id = o.product_id
GROUP BY p.id, p.name, p.price
HAVING COUNT(o.id) > 0
ORDER BY total_sold DESC;

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

-- 不同的存储过程 (逻辑有差异)
CREATE PROCEDURE CreateOrder(
    IN p_user_id INT,
    IN p_product_id INT,
    IN p_quantity INT
)
BEGIN
    DECLARE v_stock INT;
    
    -- 检查库存 (与源数据库逻辑不同)
    SELECT stock_quantity INTO v_stock FROM products WHERE id = p_product_id;
    
    IF v_stock >= p_quantity THEN
        -- 创建订单
        INSERT INTO orders (user_id, product_id, quantity)
        VALUES (p_user_id, p_product_id, p_quantity);
        
        -- 更新库存
        UPDATE products 
        SET stock_quantity = stock_quantity - p_quantity 
        WHERE id = p_product_id;
        
        SELECT LAST_INSERT_ID() as order_id, 'success' as status;
    ELSE
        SELECT 0 as order_id, 'insufficient_stock' as status;
    END IF;
END //

-- 只存在于目标数据库的存储过程
CREATE PROCEDURE TargetOnlyProcedure(IN userId INT)
BEGIN
    SELECT 
        u.username,
        COUNT(o.id) as total_orders,
        COALESCE(SUM(p.price * o.quantity), 0) as total_spent,
        AVG(r.rating) as avg_rating_given
    FROM users u
    LEFT JOIN orders o ON u.id = o.user_id
    LEFT JOIN products p ON o.product_id = p.id
    LEFT JOIN customer_reviews r ON u.id = r.user_id
    WHERE u.id = userId
    GROUP BY u.id, u.username;
END //

-- 参数不同的存储过程
CREATE PROCEDURE UpdateProductStock(
    IN p_product_id INT,
    IN p_new_stock INT,
    IN p_reason VARCHAR(100)  -- 新增参数
)
BEGIN
    UPDATE products 
    SET stock_quantity = p_new_stock,
        updated_at = CURRENT_TIMESTAMP
    WHERE id = p_product_id;
    
    INSERT INTO target_only_table (name, value, metadata)
    VALUES ('stock_update', p_new_stock, JSON_OBJECT('reason', p_reason, 'product_id', p_product_id));
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

-- 不同的函数 (计算逻辑有差异)
CREATE FUNCTION CalculateOrderTotal(orderId INT)
RETURNS DECIMAL(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE total DECIMAL(10,2) DEFAULT 0;
    DECLARE shipping DECIMAL(10,2) DEFAULT 10.00; -- 添加运费计算
    
    SELECT quantity * (SELECT price FROM products WHERE id = product_id) + shipping
    INTO total
    FROM orders
    WHERE id = orderId;
    
    RETURN IFNULL(total, shipping);
END //

-- 只存在于目标数据库的函数
CREATE FUNCTION TargetOnlyFunction(input_number INT)
RETURNS VARCHAR(50)
DETERMINISTIC
BEGIN
    DECLARE result VARCHAR(50);
    
    CASE 
        WHEN input_number < 0 THEN SET result = 'Negative';
        WHEN input_number = 0 THEN SET result = 'Zero';
        WHEN input_number > 0 AND input_number <= 100 THEN SET result = 'Small';
        ELSE SET result = 'Large';
    END CASE;
    
    RETURN CONCAT('Target: ', result);
END //

-- 返回类型不同的函数
CREATE FUNCTION GetProductAverageRating(productId INT)
RETURNS DECIMAL(3,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE avg_rating DECIMAL(3,2);
    
    SELECT COALESCE(AVG(rating), 0.00)
    INTO avg_rating
    FROM customer_reviews
    WHERE product_id = productId;
    
    RETURN avg_rating;
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

-- 不同的触发器 (逻辑有差异)
CREATE TRIGGER orders_audit
    AFTER INSERT ON orders
    FOR EACH ROW
BEGIN
    INSERT INTO target_only_table (name, value, metadata)
    VALUES ('order_created', NEW.quantity, 
            JSON_OBJECT('order_id', NEW.id, 'user_id', NEW.user_id, 'product_id', NEW.product_id));
END //

-- 只存在于目标数据库的触发器
CREATE TRIGGER target_only_trigger
    AFTER UPDATE ON products
    FOR EACH ROW
BEGIN
    IF OLD.stock_quantity != NEW.stock_quantity THEN
        INSERT INTO target_only_table (name, value, metadata)
        VALUES ('stock_changed', NEW.stock_quantity,
                JSON_OBJECT('product_id', NEW.id, 'old_stock', OLD.stock_quantity, 'new_stock', NEW.stock_quantity));
    END IF;
END //

-- 不同表的触发器
CREATE TRIGGER review_validation
    BEFORE INSERT ON customer_reviews
    FOR EACH ROW
BEGIN
    IF NEW.rating < 1 OR NEW.rating > 5 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Rating must be between 1 and 5';
    END IF;
    
    IF LENGTH(NEW.review_text) < 10 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Review text must be at least 10 characters';
    END IF;
END //

DELIMITER ;

-- ===============================================
-- 7. 插入测试数据
-- ===============================================

-- 用户数据 (相同)
INSERT INTO users (username, email) VALUES
('john_doe', 'john@example.com'),
('jane_smith', 'jane@example.com'),
('bob_wilson', 'bob@example.com'),
('alice_brown', 'alice@example.com'),
('target_user', 'target@example.com'); -- 额外用户

-- 分类数据 (字段名不同)
INSERT INTO categories (category_name, parent_category_id, display_order) VALUES
('Electronics', NULL, 1),
('Books', NULL, 2),
('Clothing', NULL, 3),
('Home & Garden', NULL, 4),
('Sports', NULL, 5); -- 额外分类

-- 产品数据 (包含新字段)
INSERT INTO products (name, description, price, category_id, stock_quantity, is_active) VALUES
('iPhone 15', '最新款苹果手机', 999.99, 1, 50, TRUE),
('MacBook Pro', '专业笔记本电脑', 1999.99, 1, 20, TRUE),
('Java编程思想', '经典编程书籍', 79.99, 2, 100, TRUE),
('Spring Boot实战', 'Spring Boot开发指南', 59.99, 2, 75, TRUE),
('牛仔裤', '经典蓝色牛仔裤', 49.99, 3, 200, TRUE),
('T恤衫', '纯棉T恤', 19.99, 3, 150, TRUE),
('篮球', '专业篮球', 29.99, 5, 80, TRUE), -- 新产品
('网球拍', '专业网球拍', 89.99, 5, 30, TRUE); -- 新产品

-- 订单数据 (缺少字段)
INSERT INTO orders (user_id, product_id, quantity) VALUES
(1, 1, 1),
(2, 3, 2),
(3, 5, 1),
(4, 2, 1),
(1, 4, 1),
(5, 7, 2), -- 新订单
(5, 8, 1); -- 新订单

-- 目标数据库独有的数据
INSERT INTO target_only_table (name, value, metadata) VALUES
('test_data_1', 123.45, '{"type": "test", "category": "A"}'),
('test_data_2', 678.90, '{"type": "demo", "category": "B"}'),
('test_data_3', 999.99, '{"type": "sample", "category": "C"}');

-- 评论数据 (目标数据库独有)
INSERT INTO customer_reviews (product_id, user_id, rating, review_text, helpful_count) VALUES
(1, 2, 5, '非常棒的手机，拍照效果很好！', 15),
(1, 3, 4, '价格有点贵，但是质量确实不错', 8),
(2, 1, 5, '性能强劲，编程开发利器', 22),
(3, 4, 5, '经典的Java书籍，值得反复阅读', 12),
(4, 2, 4, '适合Spring Boot入门学习', 6),
(7, 5, 4, '手感不错的篮球', 3),
(8, 5, 3, '网球拍重量合适，但是价格偏高', 1);

-- ===============================================
-- 8. 约束 (CONSTRAINTS) - 不同的约束
-- ===============================================

-- 一些相同的约束
ALTER TABLE products ADD CONSTRAINT chk_price_positive CHECK (price > 0);
-- 注意：orders表缺少quantity检查约束

-- 不同的约束
ALTER TABLE products ADD CONSTRAINT chk_stock_non_negative CHECK (stock_quantity >= 0);
ALTER TABLE categories ADD CONSTRAINT uk_category_name UNIQUE (category_name); -- 字段名不同

-- 目标数据库独有的约束
ALTER TABLE customer_reviews ADD CONSTRAINT chk_rating_range CHECK (rating BETWEEN 1 AND 5);
ALTER TABLE target_only_table ADD CONSTRAINT uk_target_name UNIQUE (name);

-- ===============================================
-- 显示创建完成信息
-- ===============================================
SELECT '目标数据库 (target_db) 创建完成!' as message;
SELECT 
    COUNT(*) as table_count,
    'tables created' as description
FROM information_schema.tables 
WHERE table_schema = 'target_db' AND table_type = 'BASE TABLE';

SELECT 
    COUNT(*) as view_count,
    'views created' as description
FROM information_schema.views 
WHERE table_schema = 'target_db';

SELECT 
    COUNT(*) as procedure_count,
    'procedures created' as description
FROM information_schema.routines 
WHERE routine_schema = 'target_db' AND routine_type = 'PROCEDURE';

SELECT 
    COUNT(*) as function_count,
    'functions created' as description
FROM information_schema.routines 
WHERE routine_schema = 'target_db' AND routine_type = 'FUNCTION';

-- ===============================================
-- 比较测试说明
-- ===============================================
SELECT '========== 数据库比较测试说明 ==========' as info;
SELECT '相同对象:' as category, 'users表, active_users视图, GetUserById存储过程, GetDiscountedPrice函数, users_updated_at触发器' as objects;
SELECT '不同对象:' as category, 'products表(字段差异), orders表(字段缺失), order_summary视图(逻辑差异), CreateOrder存储过程(逻辑差异)' as objects;
SELECT '仅源数据库:' as category, 'source_only_table表, source_only_view视图, SourceOnlyProcedure存储过程, SourceOnlyFunction函数' as objects;
SELECT '仅目标数据库:' as category, 'target_only_table表, customer_reviews表, target_only_view视图, TargetOnlyProcedure存储过程' as objects; 