-- ===========================================
-- 1. 创建用户（假设系统已存在 OS 用户）和 schema
-- ===========================================

CREATE SCHEMA cc1xxxx;
CREATE SCHEMA cc2xxxx;

-- ===========================================
-- 2. 相同的表
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
-- 3. 不同的表
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
-- 4. 相同索引
-- ===========================================

CREATE INDEX idx_common_id ON cc1xxxx.common_table(id);
CREATE INDEX idx_common_id ON cc2xxxx.common_table(id);

-- ===========================================
-- 5. 不同索引
-- ===========================================

DROP INDEX 

CREATE INDEX idx_custom_age ON cc1xxxx.custom_table(age);
CREATE INDEX idx_custom_age ON cc2xxxx.custom_table(gender);

-- ===========================================
-- 6. 相同触发器
-- ===========================================

CREATE OR REPLACE TRIGGER cc1xxxx.trg_common_insert
NO CASCADE BEFORE INSERT ON cc1xxxx.common_table
REFERENCING NEW AS NEW_ROW
FOR EACH ROW
BEGIN
    CALL DBMS_OUTPUT.PUT_LINE('Insert into cc1xxxx.common_table: ' || CHAR(NEW_ROW.id));
END;

CREATE OR REPLACE TRIGGER cc2xxxx.trg_common_insert
NO CASCADE BEFORE INSERT ON cc2xxxx.common_table
REFERENCING NEW AS NEW_ROW
FOR EACH ROW
BEGIN
    CALL DBMS_OUTPUT.PUT_LINE('Insert into cc2xxxx.common_table: ' || CHAR(NEW_ROW.id));
END;

-- ===========================================
-- 7. 不同触发器
-- ===========================================

CREATE OR REPLACE TRIGGER cc1xxxx.trg_custom_age
NO CASCADE BEFORE UPDATE ON cc1xxxx.custom_table
REFERENCING OLD AS OLD_ROW NEW AS NEW_ROW
FOR EACH ROW
BEGIN
    CALL DBMS_OUTPUT.PUT_LINE('cc1xxxx age changed from ' || CHAR(OLD_ROW.age) || ' to ' || CHAR(NEW_ROW.age));
END;

CREATE OR REPLACE TRIGGER cc2xxxx.trg_custom_age
NO CASCADE BEFORE INSERT ON cc2xxxx.custom_table
REFERENCING NEW AS NEW_ROW
FOR EACH ROW
BEGIN
    CALL DBMS_OUTPUT.PUT_LINE('cc2xxxx gender inserted: ' || NEW_ROW.gender);
END;

-- ===========================================
-- 8. 相同过程
-- ===========================================

CREATE OR REPLACE PROCEDURE cc1xxxx.proc_count_common(OUT p_count INTEGER)
LANGUAGE SQL
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1xxxx.common_table;
END;

CREATE OR REPLACE PROCEDURE cc2xxxx.proc_count_common(OUT p_count INTEGER)
LANGUAGE SQL
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2xxxx.common_table;
END;

-- ===========================================
-- 9. 不同过程
-- ===========================================

CREATE OR REPLACE PROCEDURE cc1xxxx.proc_check_age(OUT p_count INTEGER)
LANGUAGE SQL
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc1xxxx.custom_table WHERE age > 30;
END;

CREATE OR REPLACE PROCEDURE cc2xxxx.proc_check_age(OUT p_count INTEGER)
LANGUAGE SQL
BEGIN
    SELECT COUNT(*) INTO p_count FROM cc2xxxx.custom_table WHERE gender = 'F';
END;

-- ===========================================
-- END
-- ===========================================
