-- ===========================================
-- 1. 创建用户与授权
-- ===========================================

CREATE USER cc1 IDENTIFIED BY cc1pwd;
CREATE USER cc2 IDENTIFIED BY cc2pwd;

GRANT CONNECT, RESOURCE TO cc1;
GRANT CONNECT, RESOURCE TO cc2;

-- ===========================================
-- 2. 在 cc1 和 cc2 下创建相同的表
-- ===========================================

CREATE TABLE cc1.common_table (
    id NUMBER,
    name VARCHAR2(50)
);

CREATE TABLE cc2.common_table (
    id NUMBER,
    name VARCHAR2(50)
);

-- ===========================================
-- 3. 在 cc1 和 cc2 下创建不同的表
-- ===========================================

CREATE TABLE cc1.custom_table (
    id NUMBER,
    age NUMBER
);

CREATE TABLE cc2.custom_table (
    id NUMBER,
    gender VARCHAR2(10)
);

-- ===========================================
-- 4. 创建相同的索引
-- ===========================================

CREATE INDEX cc1.idx_common_id ON cc1.common_table(id);
CREATE INDEX cc2.idx_common_id ON cc2.common_table(id);

-- ===========================================
-- 5. 创建不同的索引
-- ===========================================

CREATE INDEX cc1.idx_custom_age ON cc1.custom_table(age);
CREATE INDEX cc2.idx_custom_age ON cc2.custom_table(gender);

-- ===========================================
-- 6. 创建相同的触发器
-- ===========================================

CREATE OR REPLACE TRIGGER cc1.trg_common_insert
BEFORE INSERT ON cc1.common_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Insert into cc1.common_table: ' || :NEW.id);
END;

CREATE OR REPLACE TRIGGER cc2.trg_common_insert
BEFORE INSERT ON cc2.common_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Insert into cc2.common_table: ' || :NEW.id);
END;

-- ===========================================
-- 7. 创建不同的触发器
-- ===========================================

CREATE OR REPLACE TRIGGER cc1.trg_custom_age
BEFORE UPDATE ON cc1.custom_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('cc1 age changed from ' || :OLD.age || ' to ' || :NEW.age);
END;

CREATE OR REPLACE TRIGGER cc2.trg_custom_age
BEFORE INSERT ON cc2.custom_table
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('cc2 gender inserted: ' || :NEW.gender);
END;

-- ===========================================
-- 8. 创建相同的存储过程
-- ===========================================

CREATE OR REPLACE PROCEDURE cc1.proc_count_common(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1.common_table;
END;

CREATE OR REPLACE PROCEDURE cc2.proc_count_common(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2.common_table;
END;

-- ===========================================
-- 9. 创建不同的存储过程
-- ===========================================

CREATE OR REPLACE PROCEDURE cc1.proc_check_age(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1.custom_table WHERE age > 30;
END;

CREATE OR REPLACE PROCEDURE cc2.proc_check_age(p_count OUT NUMBER)
AS
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2.custom_table WHERE gender = 'F';
END;

-- ===========================================
-- END
-- ===========================================
