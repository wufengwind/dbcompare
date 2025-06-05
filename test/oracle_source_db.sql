-- Oracle Source Database Test Script
-- 创建模拟电商系统的数据库结构

-- 删除已存在的对象
BEGIN
    FOR c IN (SELECT table_name FROM user_tables WHERE table_name IN ('USERS', 'CATEGORIES', 'PRODUCTS', 'ORDERS', 'SOURCE_ONLY_TABLE')) LOOP
        EXECUTE IMMEDIATE 'DROP TABLE ' || c.table_name || ' CASCADE CONSTRAINTS';
    END LOOP;
END;
/

-- 删除序列
BEGIN
    FOR c IN (SELECT sequence_name FROM user_sequences WHERE sequence_name IN ('USER_SEQ', 'CATEGORY_SEQ', 'PRODUCT_SEQ', 'ORDER_SEQ')) LOOP
        EXECUTE IMMEDIATE 'DROP SEQUENCE ' || c.sequence_name;
    END LOOP;
END;
/

-- 1. 用户表
CREATE TABLE users (
    user_id NUMBER(10) PRIMARY KEY,
    username VARCHAR2(50) NOT NULL UNIQUE,
    email VARCHAR2(100) NOT NULL,
    password_hash VARCHAR2(255) NOT NULL,
    first_name VARCHAR2(50),
    last_name VARCHAR2(50),
    phone VARCHAR2(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_active NUMBER(1) DEFAULT 1 CHECK (is_active IN (0,1))
);

-- 2. 商品分类表
CREATE TABLE categories (
    category_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(100) NOT NULL,
    description VARCHAR2(500),
    parent_id NUMBER(10),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_category_parent FOREIGN KEY (parent_id) REFERENCES categories(category_id)
);

-- 3. 商品表
CREATE TABLE products (
    product_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(200) NOT NULL,
    description CLOB,
    price NUMBER(10,2) NOT NULL CHECK (price >= 0),
    cost_price NUMBER(10,2) CHECK (cost_price >= 0),
    stock_quantity NUMBER(10) DEFAULT 0 CHECK (stock_quantity >= 0),
    category_id NUMBER(10),
    sku VARCHAR2(50) UNIQUE,
    status VARCHAR2(20) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE', 'INACTIVE', 'DISCONTINUED')),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_product_category FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- 4. 订单表
CREATE TABLE orders (
    order_id NUMBER(10) PRIMARY KEY,
    user_id NUMBER(10) NOT NULL,
    product_id NUMBER(10) NOT NULL,
    quantity NUMBER(10) NOT NULL CHECK (quantity > 0),
    unit_price NUMBER(10,2) NOT NULL CHECK (unit_price >= 0),
    total_amount NUMBER(10,2) NOT NULL CHECK (total_amount >= 0),
    order_status VARCHAR2(20) DEFAULT 'PENDING' CHECK (order_status IN ('PENDING', 'CONFIRMED', 'SHIPPED', 'DELIVERED', 'CANCELLED')),
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    shipping_address VARCHAR2(500),
    notes VARCHAR2(1000),
    CONSTRAINT fk_order_user FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT fk_order_product FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 5. 仅源数据库表
CREATE TABLE source_only_table (
    id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(100),
    description VARCHAR2(500),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 创建序列
CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE category_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE product_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE order_seq START WITH 1 INCREMENT BY 1;

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
CREATE OR REPLACE VIEW active_users AS
SELECT user_id, username, email, first_name, last_name, phone, created_at
FROM users 
WHERE is_active = 1;

CREATE OR REPLACE VIEW order_summary AS
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
JOIN users u ON o.user_id = u.user_id
JOIN products p ON o.product_id = p.product_id;

CREATE OR REPLACE VIEW source_only_view AS
SELECT id, name, UPPER(description) AS description
FROM source_only_table;

-- 创建存储过程
CREATE OR REPLACE PROCEDURE GetUserById(p_user_id IN NUMBER, p_cursor OUT SYS_REFCURSOR)
IS
BEGIN
    OPEN p_cursor FOR
    SELECT user_id, username, email, first_name, last_name
    FROM users
    WHERE user_id = p_user_id;
END GetUserById;
/

CREATE OR REPLACE PROCEDURE CreateOrder(
    p_user_id IN NUMBER,
    p_product_id IN NUMBER,
    p_quantity IN NUMBER,
    p_unit_price IN NUMBER,
    p_order_id OUT NUMBER
)
IS
    v_total NUMBER(10,2);
BEGIN
    v_total := p_quantity * p_unit_price;
    
    INSERT INTO orders (order_id, user_id, product_id, quantity, unit_price, total_amount)
    VALUES (order_seq.NEXTVAL, p_user_id, p_product_id, p_quantity, p_unit_price, v_total)
    RETURNING order_id INTO p_order_id;
    
    COMMIT;
END CreateOrder;
/

CREATE OR REPLACE PROCEDURE SourceOnlyProcedure(p_id IN NUMBER)
IS
BEGIN
    UPDATE source_only_table SET description = 'Updated by procedure' WHERE id = p_id;
    COMMIT;
END SourceOnlyProcedure;
/

-- 创建函数
CREATE OR REPLACE FUNCTION CalculateOrderTotal(p_order_id IN NUMBER)
RETURN NUMBER
IS
    v_total NUMBER(10,2);
BEGIN
    SELECT total_amount INTO v_total
    FROM orders
    WHERE order_id = p_order_id;
    
    RETURN v_total;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 0;
END CalculateOrderTotal;
/

CREATE OR REPLACE FUNCTION GetDiscountedPrice(p_price IN NUMBER, p_discount_rate IN NUMBER DEFAULT 0.1)
RETURN NUMBER
IS
BEGIN
    RETURN p_price * (1 - p_discount_rate);
END GetDiscountedPrice;
/

CREATE OR REPLACE FUNCTION SourceOnlyFunction(p_input IN VARCHAR2)
RETURN VARCHAR2
IS
BEGIN
    RETURN 'Source: ' || p_input;
END SourceOnlyFunction;
/

-- 创建触发器
CREATE OR REPLACE TRIGGER users_updated_at
    BEFORE UPDATE ON users
    FOR EACH ROW
BEGIN
    :NEW.updated_at := CURRENT_TIMESTAMP;
END;
/

CREATE OR REPLACE TRIGGER orders_audit
    AFTER INSERT OR UPDATE OR DELETE ON orders
    FOR EACH ROW
DECLARE
    v_action VARCHAR2(10);
BEGIN
    IF INSERTING THEN
        v_action := 'INSERT';
    ELSIF UPDATING THEN
        v_action := 'UPDATE';
    ELSE
        v_action := 'DELETE';
    END IF;
    
    -- 这里可以记录到审计表
    NULL;
END;
/

CREATE OR REPLACE TRIGGER source_only_trigger
    BEFORE INSERT ON source_only_table
    FOR EACH ROW
BEGIN
    IF :NEW.created_at IS NULL THEN
        :NEW.created_at := CURRENT_TIMESTAMP;
    END IF;
END;
/

-- 插入测试数据
INSERT INTO categories (category_id, name, description) VALUES (category_seq.NEXTVAL, '电子产品', '各类电子设备');
INSERT INTO categories (category_id, name, description) VALUES (category_seq.NEXTVAL, '服装', '男女服装');
INSERT INTO categories (category_id, name, description) VALUES (category_seq.NEXTVAL, '图书', '各类书籍');

INSERT INTO users (user_id, username, email, password_hash, first_name, last_name, phone) VALUES 
(user_seq.NEXTVAL, 'john_doe', 'john@example.com', 'hash123', 'John', 'Doe', '1234567890');
INSERT INTO users (user_id, username, email, password_hash, first_name, last_name, phone) VALUES 
(user_seq.NEXTVAL, 'jane_smith', 'jane@example.com', 'hash456', 'Jane', 'Smith', '0987654321');

INSERT INTO products (product_id, name, description, price, cost_price, stock_quantity, category_id, sku) VALUES 
(product_seq.NEXTVAL, 'iPhone 15', '最新款iPhone', 999.99, 700.00, 50, 1, 'IP15-001');
INSERT INTO products (product_id, name, description, price, cost_price, stock_quantity, category_id, sku) VALUES 
(product_seq.NEXTVAL, 'MacBook Pro', '专业笔记本电脑', 2499.99, 1800.00, 20, 1, 'MBP-001');

INSERT INTO source_only_table (id, name, description) VALUES (1, 'Test Item', 'Only in source');

-- 提交所有更改
COMMIT;

-- 显示创建的对象统计
SELECT 'Tables' AS object_type, COUNT(*) AS count FROM user_tables
UNION ALL
SELECT 'Views', COUNT(*) FROM user_views
UNION ALL
SELECT 'Procedures', COUNT(*) FROM user_procedures WHERE object_type = 'PROCEDURE'
UNION ALL
SELECT 'Functions', COUNT(*) FROM user_procedures WHERE object_type = 'FUNCTION'
UNION ALL
SELECT 'Triggers', COUNT(*) FROM user_triggers
UNION ALL
SELECT 'Sequences', COUNT(*) FROM user_sequences
UNION ALL
SELECT 'Indexes', COUNT(*) FROM user_indexes WHERE index_type = 'NORMAL'; 