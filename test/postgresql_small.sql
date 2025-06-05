-- ===========================================
-- 1. 创建用户（Role）及授权
-- ===========================================

-- 创建模式，授权给对应用户
CREATE SCHEMA AUTHORIZATION cc1xxxx;
CREATE SCHEMA AUTHORIZATION cc2xxxx;

-- 赋予创建表、索引等权限（示例，实际可调整）
GRANT CREATE ON SCHEMA cc1xxxx TO cc1xxxx;
GRANT CREATE ON SCHEMA cc2xxxx TO cc2xxxx;

-- ===========================================
-- 2. 在 cc1xxxx 和 cc2xxxx 下创建相同的表
-- ===========================================

CREATE TABLE cc1xxxx.common_table (
    id INTEGER,
    name VARCHAR(50)
);

CREATE TABLE cc2xxxx.common_table (
    id INTEGER,
    name VARCHAR(50)
);

-- ===========================================
-- 3. 在 cc1xxxx 和 cc2xxxx 下创建不同的表
-- ===========================================

CREATE TABLE cc1xxxx.custom_table (
    id INTEGER,
    age INTEGER
);

CREATE TABLE cc2xxxx.custom_table (
    id INTEGER,
    gender VARCHAR(10)
);

-- ===========================================
-- 4. 创建相同的索引
-- ===========================================

CREATE INDEX idx_common_id ON cc1xxxx.common_table(id);
CREATE INDEX idx_common_id ON cc2xxxx.common_table(id);

-- ===========================================
-- 5. 创建不同的索引
-- ===========================================

CREATE INDEX idx_custom_age ON cc1xxxx.custom_table(age);
CREATE INDEX idx_custom_age ON cc2xxxx.custom_table(gender);

-- ===========================================
-- 6. 创建相同的触发器及对应函数
-- ===========================================

CREATE OR REPLACE FUNCTION cc1xxxx.trg_common_insert()
RETURNS trigger AS $$
BEGIN
    RAISE NOTICE 'Insert into cc1xxxx.common_table: %', NEW.id;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_common_insert
BEFORE INSERT ON cc1xxxx.common_table
FOR EACH ROW EXECUTE FUNCTION cc1xxxx.trg_common_insert();

CREATE OR REPLACE FUNCTION cc2xxxx.trg_common_insert()
RETURNS trigger AS $$
BEGIN
    RAISE NOTICE 'Insert into cc2xxxx.common_table: %', NEW.id;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_common_insert
BEFORE INSERT ON cc2xxxx.common_table
FOR EACH ROW EXECUTE FUNCTION cc2xxxx.trg_common_insert();

-- ===========================================
-- 7. 创建不同的触发器及对应函数
-- ===========================================

CREATE OR REPLACE FUNCTION cc1xxxx.trg_custom_age()
RETURNS trigger AS $$
BEGIN
    RAISE NOTICE 'cc1xxxx age changed from % to %', OLD.age, NEW.age;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_custom_age
BEFORE UPDATE ON cc1xxxx.custom_table
FOR EACH ROW EXECUTE FUNCTION cc1xxxx.trg_custom_age();

CREATE OR REPLACE FUNCTION cc2xxxx.trg_custom_age()
RETURNS trigger AS $$
BEGIN
    RAISE NOTICE 'cc2xxxx gender inserted: %', NEW.gender;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_custom_age
BEFORE INSERT ON cc2xxxx.custom_table
FOR EACH ROW EXECUTE FUNCTION cc2xxxx.trg_custom_age();

-- ===========================================
-- 8. 创建相同的存储过程（函数）
-- ===========================================

CREATE OR REPLACE FUNCTION cc1xxxx.proc_count_common(OUT p_count INTEGER)
AS $$
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1xxxx.common_table;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION cc2xxxx.proc_count_common(OUT p_count INTEGER)
AS $$
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2xxxx.common_table;
END;
$$ LANGUAGE plpgsql;

-- ===========================================
-- 9. 创建不同的存储过程（函数）
-- ===========================================

CREATE OR REPLACE FUNCTION cc1xxxx.proc_check_age(OUT p_count INTEGER)
AS $$
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1xxxx.custom_table WHERE age > 30;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION cc2xxxx.proc_check_age(OUT p_count INTEGER)
AS $$
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2xxxx.custom_table WHERE gender = 'F';
END;
$$ LANGUAGE plpgsql;

-- ===========================================
-- END
-- ===========================================
