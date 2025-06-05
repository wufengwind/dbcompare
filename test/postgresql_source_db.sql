-- PostgreSQL Source Database Test Script
-- 创建模拟电商系统的数据库结构

-- 创建数据库 (需要手动执行)
-- CREATE DATABASE ecommerce_source ENCODING 'UTF8';

-- 使用数据库
-- \c ecommerce_source;

-- 删除已存在的对象
DROP TABLE IF EXISTS orders CASCADE;
DROP TABLE IF EXISTS products CASCADE;
DROP TABLE IF EXISTS categories CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS source_only_table CASCADE;

-- 删除序列
DROP SEQUENCE IF EXISTS user_seq CASCADE;
DROP SEQUENCE IF EXISTS category_seq CASCADE;
DROP SEQUENCE IF EXISTS product_seq CASCADE;
DROP SEQUENCE IF EXISTS order_seq CASCADE;

-- 删除类型
DROP TYPE IF EXISTS order_status_type CASCADE;
DROP TYPE IF EXISTS product_status_type CASCADE;

-- 创建枚举类型
CREATE TYPE order_status_type AS ENUM ('PENDING', 'CONFIRMED', 'SHIPPED', 'DELIVERED', 'CANCELLED');
CREATE TYPE product_status_type AS ENUM ('ACTIVE', 'INACTIVE', 'DISCONTINUED');

-- 创建序列
CREATE SEQUENCE user_seq START 1 INCREMENT 1;
CREATE SEQUENCE category_seq START 1 INCREMENT 1;
CREATE SEQUENCE product_seq START 1 INCREMENT 1;
CREATE SEQUENCE order_seq START 1 INCREMENT 1;

-- 1. 用户表
CREATE TABLE users (
    user_id INTEGER PRIMARY KEY DEFAULT nextval('user_seq'),
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    phone VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_active BOOLEAN DEFAULT TRUE
);

-- 2. 商品分类表
CREATE TABLE categories (
    category_id INTEGER PRIMARY KEY DEFAULT nextval('category_seq'),
    name VARCHAR(100) NOT NULL,
    description TEXT,
    parent_id INTEGER REFERENCES categories(category_id),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 3. 商品表
CREATE TABLE products (
    product_id INTEGER PRIMARY KEY DEFAULT nextval('product_seq'),
    name VARCHAR(200) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    cost_price DECIMAL(10,2) CHECK (cost_price >= 0),
    stock_quantity INTEGER DEFAULT 0 CHECK (stock_quantity >= 0),
    category_id INTEGER REFERENCES categories(category_id),
    sku VARCHAR(50) UNIQUE,
    status product_status_type DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 4. 订单表
CREATE TABLE orders (
    order_id INTEGER PRIMARY KEY DEFAULT nextval('order_seq'),
    user_id INTEGER NOT NULL REFERENCES users(user_id),
    product_id INTEGER NOT NULL REFERENCES products(product_id),
    quantity INTEGER NOT NULL CHECK (quantity > 0),
    unit_price DECIMAL(10,2) NOT NULL CHECK (unit_price >= 0),
    total_amount DECIMAL(10,2) NOT NULL CHECK (total_amount >= 0),
    order_status order_status_type DEFAULT 'PENDING',
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    shipping_address TEXT,
    notes TEXT
);

-- 5. 仅源数据库表
CREATE TABLE source_only_table (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 创建索引
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_users_username ON users(username);
CREATE INDEX idx_products_category ON products(category_id);
CREATE INDEX idx_products_sku ON products(sku);
CREATE INDEX idx_orders_user_date ON orders(user_id, order_date);
CREATE INDEX idx_orders_status_date ON orders(order_status, order_date);
CREATE INDEX idx_source_only ON source_only_table(name);

-- 创建唯一约束
ALTER TABLE categories ADD CONSTRAINT uk_category_name UNIQUE (name);

-- 创建视图
CREATE VIEW active_users AS
SELECT user_id, username, email, first_name, last_name, phone, created_at
FROM users 
WHERE is_active = TRUE;

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

CREATE VIEW source_only_view AS
SELECT id, name, UPPER(description) AS description
FROM source_only_table;

-- 创建存储函数 (PostgreSQL 使用函数代替存储过程)
CREATE OR REPLACE FUNCTION get_user_by_id(p_user_id INTEGER)
RETURNS TABLE(user_id INTEGER, username VARCHAR, email VARCHAR, first_name VARCHAR, last_name VARCHAR)
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN QUERY
    SELECT u.user_id, u.username, u.email, u.first_name, u.last_name
    FROM users u
    WHERE u.user_id = p_user_id;
END;
$$;

CREATE OR REPLACE FUNCTION create_order(
    p_user_id INTEGER,
    p_product_id INTEGER,
    p_quantity INTEGER,
    p_unit_price DECIMAL(10,2)
)
RETURNS INTEGER
LANGUAGE plpgsql
AS $$
DECLARE
    v_total DECIMAL(10,2);
    v_order_id INTEGER;
BEGIN
    v_total := p_quantity * p_unit_price;
    
    INSERT INTO orders (user_id, product_id, quantity, unit_price, total_amount)
    VALUES (p_user_id, p_product_id, p_quantity, p_unit_price, v_total)
    RETURNING order_id INTO v_order_id;
    
    RETURN v_order_id;
END;
$$;

CREATE OR REPLACE FUNCTION source_only_procedure(p_id INTEGER)
RETURNS VOID
LANGUAGE plpgsql
AS $$
BEGIN
    UPDATE source_only_table 
    SET description = 'Updated by procedure'
    WHERE id = p_id;
END;
$$;

CREATE OR REPLACE FUNCTION calculate_order_total(p_order_id INTEGER)
RETURNS DECIMAL(10,2)
LANGUAGE plpgsql
AS $$
DECLARE
    v_total DECIMAL(10,2);
BEGIN
    SELECT total_amount INTO v_total
    FROM orders
    WHERE order_id = p_order_id;
    
    RETURN COALESCE(v_total, 0);
END;
$$;

CREATE OR REPLACE FUNCTION get_discounted_price(
    p_price DECIMAL(10,2), 
    p_discount_rate DECIMAL(3,2) DEFAULT 0.1
)
RETURNS DECIMAL(10,2)
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN p_price * (1 - p_discount_rate);
END;
$$;

CREATE OR REPLACE FUNCTION source_only_function(p_input TEXT)
RETURNS TEXT
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN 'Source: ' || p_input;
END;
$$;

-- 创建触发器函数
CREATE OR REPLACE FUNCTION update_updated_at_column()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $$
BEGIN
    NEW.updated_at = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$;

CREATE OR REPLACE FUNCTION orders_audit_function()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $$
DECLARE
    v_action TEXT;
BEGIN
    IF TG_OP = 'INSERT' THEN
        v_action := 'INSERT';
    ELSIF TG_OP = 'UPDATE' THEN
        v_action := 'UPDATE';
    ELSIF TG_OP = 'DELETE' THEN
        v_action := 'DELETE';
    END IF;
    
    -- 这里可以记录到审计表
    -- INSERT INTO audit_log (table_name, action, timestamp) VALUES ('orders', v_action, CURRENT_TIMESTAMP);
    
    IF TG_OP = 'DELETE' THEN
        RETURN OLD;
    ELSE
        RETURN NEW;
    END IF;
END;
$$;

CREATE OR REPLACE FUNCTION source_only_trigger_function()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $$
BEGIN
    IF NEW.created_at IS NULL THEN
        NEW.created_at := CURRENT_TIMESTAMP;
    END IF;
    RETURN NEW;
END;
$$;

-- 创建触发器
CREATE TRIGGER users_updated_at
    BEFORE UPDATE ON users
    FOR EACH ROW
    EXECUTE FUNCTION update_updated_at_column();

CREATE TRIGGER products_updated_at
    BEFORE UPDATE ON products
    FOR EACH ROW
    EXECUTE FUNCTION update_updated_at_column();

CREATE TRIGGER orders_audit
    AFTER INSERT OR UPDATE OR DELETE ON orders
    FOR EACH ROW
    EXECUTE FUNCTION orders_audit_function();

CREATE TRIGGER source_only_trigger
    BEFORE INSERT ON source_only_table
    FOR EACH ROW
    EXECUTE FUNCTION source_only_trigger_function();

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
FROM information_schema.tables 
WHERE table_schema = 'public' AND table_type = 'BASE TABLE'
UNION ALL
SELECT 'Views', COUNT(*) 
FROM information_schema.views 
WHERE table_schema = 'public'
UNION ALL
SELECT 'Functions', COUNT(*) 
FROM information_schema.routines 
WHERE routine_schema = 'public' AND routine_type = 'FUNCTION'
UNION ALL
SELECT 'Triggers', COUNT(*) 
FROM information_schema.triggers 
WHERE trigger_schema = 'public'
UNION ALL
SELECT 'Sequences', COUNT(*) 
FROM information_schema.sequences 
WHERE sequence_schema = 'public'
UNION ALL
SELECT 'Indexes', COUNT(*) 
FROM pg_indexes 
WHERE schemaname = 'public';

-- 显示成功消息
SELECT 'PostgreSQL Source Database created successfully!' AS message; 