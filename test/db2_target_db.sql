-- DB2 Target Database Test Script
-- 创建与源数据库有差异的数据库结构用于测试比较

-- 连接到数据库 (需要手动执行)
-- CONNECT TO your_database_name;

-- 删除已存在的对象
BEGIN
    DECLARE table_name VARCHAR(128);
    DECLARE cur CURSOR FOR
        SELECT TABNAME FROM SYSCAT.TABLES 
        WHERE TABSCHEMA = CURRENT SCHEMA 
        AND TABNAME IN ('USERS', 'CATEGORIES', 'PRODUCTS', 'ORDERS', 'CUSTOMER_REVIEWS', 'TARGET_ONLY_TABLE');
    
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET table_name = NULL;
    
    OPEN cur;
    fetch_loop: LOOP
        FETCH cur INTO table_name;
        IF table_name IS NULL THEN
            LEAVE fetch_loop;
        END IF;
        
        EXECUTE IMMEDIATE 'DROP TABLE ' || table_name;
    END LOOP;
    CLOSE cur;
END@

-- 删除序列
BEGIN
    DECLARE seq_name VARCHAR(128);
    DECLARE cur CURSOR FOR
        SELECT SEQNAME FROM SYSCAT.SEQUENCES 
        WHERE SEQSCHEMA = CURRENT SCHEMA 
        AND SEQNAME IN ('USER_SEQ', 'CATEGORY_SEQ', 'PRODUCT_SEQ', 'ORDER_SEQ', 'REVIEW_SEQ');
    
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET seq_name = NULL;
    
    OPEN cur;
    fetch_loop: LOOP
        FETCH cur INTO seq_name;
        IF seq_name IS NULL THEN
            LEAVE fetch_loop;
        END IF;
        
        EXECUTE IMMEDIATE 'DROP SEQUENCE ' || seq_name;
    END LOOP;
    CLOSE cur;
END@

-- 1. 用户表 (有差异)
CREATE TABLE users (
    user_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    phone VARCHAR(20),
    birth_date DATE,  -- 新增字段
    country VARCHAR(50) DEFAULT 'China',  -- 新增字段
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_active SMALLINT DEFAULT 1 CHECK (is_active IN (0,1)),
    PRIMARY KEY (user_id)
);

-- 2. 商品分类表 (相同)
CREATE TABLE categories (
    category_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    parent_id INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (category_id),
    FOREIGN KEY (parent_id) REFERENCES categories(category_id)
);

-- 3. 商品表 (有差异)
CREATE TABLE products (
    product_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    name VARCHAR(200) NOT NULL,
    description CLOB,
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    cost_price DECIMAL(10,2) CHECK (cost_price >= 0),
    stock_quantity INTEGER DEFAULT 0 CHECK (stock_quantity >= 0),
    min_stock_level INTEGER DEFAULT 10,  -- 新增字段
    category_id INTEGER,
    sku VARCHAR(50) UNIQUE,
    brand VARCHAR(100),  -- 新增字段
    weight DECIMAL(8,2),  -- 新增字段
    status VARCHAR(20) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE', 'INACTIVE', 'DISCONTINUED')),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (product_id),
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- 4. 订单表 (缺少字段)
CREATE TABLE orders (
    order_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    user_id INTEGER NOT NULL,
    product_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL CHECK (quantity > 0),
    unit_price DECIMAL(10,2) NOT NULL CHECK (unit_price >= 0),
    total_amount DECIMAL(10,2) NOT NULL CHECK (total_amount >= 0),
    order_status VARCHAR(20) DEFAULT 'PENDING' CHECK (order_status IN ('PENDING', 'CONFIRMED', 'SHIPPED', 'DELIVERED', 'CANCELLED')),
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    -- 缺少 shipping_address 和 notes 字段
    PRIMARY KEY (order_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 5. 客户评价表 (仅目标数据库)
CREATE TABLE customer_reviews (
    review_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    user_id INTEGER NOT NULL,
    product_id INTEGER NOT NULL,
    rating SMALLINT CHECK (rating BETWEEN 1 AND 5),
    review_text CLOB,
    review_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_verified SMALLINT DEFAULT 0 CHECK (is_verified IN (0,1)),
    PRIMARY KEY (review_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 6. 仅目标数据库表
CREATE TABLE target_only_table (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    name VARCHAR(100),
    value DECIMAL(10,2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

-- 创建序列 (如果需要)
CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE category_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE product_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE order_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE review_seq START WITH 1 INCREMENT BY 1;

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

-- 创建唯一约束
ALTER TABLE categories ADD CONSTRAINT uk_category_name UNIQUE (name);

-- 创建视图
CREATE VIEW active_users AS
SELECT user_id, username, email, first_name, last_name, phone, country, created_at
FROM users 
WHERE is_active = 1;

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

CREATE VIEW popular_products AS
SELECT 
    p.product_id,
    p.name,
    COUNT(o.order_id) AS order_count,
    AVG(DECIMAL(cr.rating)) AS avg_rating
FROM products p
LEFT JOIN orders o ON p.product_id = o.product_id
LEFT JOIN customer_reviews cr ON p.product_id = cr.product_id
GROUP BY p.product_id, p.name;

CREATE VIEW target_only_view AS
SELECT id, name, value * 1.08 AS value_with_tax
FROM target_only_table;

-- 创建存储过程
CREATE PROCEDURE GetUserById(IN p_user_id INTEGER)
LANGUAGE SQL
READS SQL DATA
RESULT SETS 1
BEGIN
    DECLARE cur CURSOR WITH RETURN FOR
        SELECT user_id, username, email, first_name, last_name, country
        FROM users
        WHERE user_id = p_user_id;
    
    OPEN cur;
END@

CREATE PROCEDURE CreateOrder(
    IN p_user_id INTEGER,
    IN p_product_id INTEGER,
    IN p_quantity INTEGER,
    IN p_unit_price DECIMAL(10,2),
    OUT p_order_id INTEGER
)
LANGUAGE SQL
MODIFIES SQL DATA
BEGIN
    DECLARE v_total DECIMAL(10,2);
    DECLARE v_stock INTEGER;
    
    -- 检查库存
    SELECT stock_quantity INTO v_stock
    FROM products
    WHERE product_id = p_product_id;
    
    IF v_stock < p_quantity THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient stock';
    END IF;
    
    SET v_total = p_quantity * p_unit_price;
    
    INSERT INTO orders (user_id, product_id, quantity, unit_price, total_amount)
    VALUES (p_user_id, p_product_id, p_quantity, p_unit_price, v_total);
    
    SET p_order_id = IDENTITY_VAL_LOCAL();
    
    -- 更新库存
    UPDATE products 
    SET stock_quantity = stock_quantity - p_quantity
    WHERE product_id = p_product_id;
    
    COMMIT;
END@

CREATE PROCEDURE UpdateProductStock(
    IN p_product_id INTEGER,
    IN p_new_stock INTEGER
)
LANGUAGE SQL
MODIFIES SQL DATA
BEGIN
    UPDATE products 
    SET stock_quantity = p_new_stock,
        updated_at = CURRENT_TIMESTAMP
    WHERE product_id = p_product_id;
    
    COMMIT;
END@

CREATE PROCEDURE TargetOnlyProcedure(IN p_id INTEGER, IN p_value DECIMAL(10,2))
LANGUAGE SQL
MODIFIES SQL DATA
BEGIN
    UPDATE target_only_table 
    SET value = p_value
    WHERE id = p_id;
    
    COMMIT;
END@

-- 创建函数
CREATE FUNCTION CalculateOrderTotal(p_order_id INTEGER)
RETURNS DECIMAL(10,2)
LANGUAGE SQL
READS SQL DATA
DETERMINISTIC
BEGIN
    DECLARE v_total DECIMAL(10,2) DEFAULT 0;
    
    SELECT total_amount INTO v_total
    FROM orders
    WHERE order_id = p_order_id;
    
    RETURN v_total;
END@

CREATE FUNCTION GetDiscountedPrice(p_price DECIMAL(10,2), p_discount_rate DECIMAL(3,2))
RETURNS DECIMAL(10,2)
LANGUAGE SQL
DETERMINISTIC
BEGIN
    RETURN p_price * (1 - COALESCE(p_discount_rate, 0.15));
END@

CREATE FUNCTION GetProductAverageRating(p_product_id INTEGER)
RETURNS DECIMAL(3,2)
LANGUAGE SQL
READS SQL DATA
DETERMINISTIC
BEGIN
    DECLARE v_avg_rating DECIMAL(3,2) DEFAULT 0;
    
    SELECT AVG(DECIMAL(rating)) INTO v_avg_rating
    FROM customer_reviews
    WHERE product_id = p_product_id;
    
    RETURN COALESCE(v_avg_rating, 0);
END@

CREATE FUNCTION TargetOnlyFunction(p_input VARCHAR(100))
RETURNS VARCHAR(200)
LANGUAGE SQL
DETERMINISTIC
BEGIN
    RETURN 'Target: ' || UPPER(p_input);
END@

-- 创建触发器
CREATE TRIGGER users_updated_at
    BEFORE UPDATE ON users
    REFERENCING NEW AS N OLD AS O
    FOR EACH ROW
    SET N.updated_at = CURRENT_TIMESTAMP;

CREATE TRIGGER products_updated_at
    BEFORE UPDATE ON products
    REFERENCING NEW AS N OLD AS O
    FOR EACH ROW
    SET N.updated_at = CURRENT_TIMESTAMP;

CREATE TRIGGER orders_audit
    AFTER INSERT ON orders
    REFERENCING NEW AS N
    FOR EACH ROW
BEGIN
    -- 这里可以记录到审计表
    -- INSERT INTO audit_log (table_name, action, timestamp) VALUES ('orders', 'INSERT', CURRENT_TIMESTAMP);
    VALUES(1); -- 占位语句
END@

CREATE TRIGGER review_validation
    BEFORE INSERT ON customer_reviews
    REFERENCING NEW AS N
    FOR EACH ROW
BEGIN
    IF N.rating IS NOT NULL AND (N.rating < 1 OR N.rating > 5) THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Rating must be between 1 and 5';
    END IF;
END@

CREATE TRIGGER target_only_trigger
    BEFORE INSERT ON target_only_table
    REFERENCING NEW AS N
    FOR EACH ROW
BEGIN
    IF N.created_at IS NULL THEN
        SET N.created_at = CURRENT_TIMESTAMP;
    END IF;
END@

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

-- 提交所有更改
COMMIT;

-- 显示创建的对象统计
SELECT 'Tables' AS object_type, COUNT(*) AS count 
FROM SYSCAT.TABLES 
WHERE TABSCHEMA = CURRENT SCHEMA
UNION ALL
SELECT 'Views', COUNT(*) 
FROM SYSCAT.VIEWS 
WHERE VIEWSCHEMA = CURRENT SCHEMA
UNION ALL
SELECT 'Procedures', COUNT(*) 
FROM SYSCAT.PROCEDURES 
WHERE PROCSCHEMA = CURRENT SCHEMA
UNION ALL
SELECT 'Functions', COUNT(*) 
FROM SYSCAT.FUNCTIONS 
WHERE FUNCSCHEMA = CURRENT SCHEMA AND FUNCNAME NOT LIKE 'SYS%'
UNION ALL
SELECT 'Triggers', COUNT(*) 
FROM SYSCAT.TRIGGERS 
WHERE TRIGSCHEMA = CURRENT SCHEMA
UNION ALL
SELECT 'Sequences', COUNT(*) 
FROM SYSCAT.SEQUENCES 
WHERE SEQSCHEMA = CURRENT SCHEMA
UNION ALL
SELECT 'Indexes', COUNT(*) 
FROM SYSCAT.INDEXES 
WHERE INDSCHEMA = CURRENT SCHEMA AND UNIQUERULE = 'D';

-- 显示成功消息
VALUES ('DB2 Target Database created successfully!');

-- 重置语句终止符
COMMIT@ 