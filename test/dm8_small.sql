-- ===========================================
-- 1. 创建用户与授权（DM8语法）
-- ===========================================

CREATE USER cc1xxxx IDENTIFIED BY "AAAAAAAAAA";
CREATE USER cc2xxxx IDENTIFIED BY "AAAAAAAAAA";

GRANT RESOURCE TO cc1xxxx;
GRANT RESOURCE TO cc2xxxx;

-- ===========================================
-- 2. 在 cc1xxxx 和 cc2xxxx 下创建相同的表
-- ===========================================

CREATE TABLE cc1xxxx.common_table (
    id NUMBER,
    name VARCHAR2(50)
);

CREATE TABLE cc2xxxx.common_table (
    id NUMBER,
    name VARCHAR2(50)
);

-- ===========================================
-- 3. 在 cc1xxxx 和 cc2xxxx 下创建不同的表
-- ===========================================

CREATE TABLE cc1xxxx.custom_table (
    id NUMBER,
    age NUMBER
);

CREATE TABLE cc2xxxx.custom_table (
    id NUMBER,
    gender VARCHAR2(10)
);

-- ===========================================
-- 4. 创建相同的索引
-- ===========================================

CREATE INDEX cc1xxxx.idx_common_id ON cc1xxxx.common_table(id);
CREATE INDEX cc2xxxx.idx_common_id ON cc2xxxx.common_table(id);

-- ===========================================
-- 5. 创建不同的索引
-- ===========================================

CREATE INDEX cc1xxxx.idx_custom_age ON cc1xxxx.custom_table(age);
CREATE INDEX cc2xxxx.idx_custom_age ON cc2xxxx.custom_table(gender);

-- ===========================================
-- 6. 创建相同的触发器
-- ===========================================

CREATE OR REPLACE TRIGGER cc1xxxx.trg_common_insert
BEFORE INSERT ON cc1xxxx.common_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Insert into cc1xxxx.common_table: ' || :NEW.id);
END;

CREATE OR REPLACE TRIGGER cc2xxxx.trg_common_insert
BEFORE INSERT ON cc2xxxx.common_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Insert into cc2xxxx.common_table: ' || :NEW.id);
END;

-- ===========================================
-- 7. 创建不同的触发器
-- ===========================================

CREATE OR REPLACE TRIGGER cc1xxxx.trg_custom_age
BEFORE UPDATE ON cc1xxxx.custom_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('cc1xxxx age changed from ' || :OLD.age || ' to ' || :NEW.age);
END;

CREATE OR REPLACE TRIGGER cc2xxxx.trg_custom_age
BEFORE INSERT ON cc2xxxx.custom_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('cc2xxxx gender inserted: ' || :NEW.gender);
END;

-- ===========================================
-- 8. 创建相同的存储过程
-- ===========================================

CREATE OR REPLACE PROCEDURE cc1xxxx.proc_count_common(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1xxxx.common_table;
END;

CREATE OR REPLACE PROCEDURE cc2xxxx.proc_count_common(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2xxxx.common_table;
END;

-- ===========================================
-- 9. 创建不同的存储过程
-- ===========================================

CREATE OR REPLACE PROCEDURE cc1xxxx.proc_check_age(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1xxxx.custom_table WHERE age > 30;
END;

CREATE OR REPLACE PROCEDURE cc2xxxx.proc_check_age(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2xxxx.custom_table WHERE gender = 'F';
END;

-- ===========================================
-- END
-- ===========================================
