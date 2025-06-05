-- ===========================================
-- 1. 创建登录和用户
-- ===========================================

CREATE SCHEMA cc1xxxx;
CREATE SCHEMA cc2xxxx;

-- ===========================================
-- 2. 创建相同的表
-- ===========================================

CREATE TABLE cc1xxxx.common_table (
    id INT,
    name VARCHAR(50)
);

CREATE TABLE cc2xxxx.common_table (
    id INT,
    name VARCHAR(50)
);

-- ===========================================
-- 3. 不同的表
-- ===========================================

CREATE TABLE cc1xxxx.custom_table (
    id INT,
    age INT
);

CREATE TABLE cc2xxxx.custom_table (
    id INT,
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

CREATE INDEX idx_custom_age ON cc1xxxx.custom_table(age);
CREATE INDEX idx_custom_age ON cc2xxxx.custom_table(gender);

-- ===========================================
-- 6. 相同触发器
-- ===========================================

CREATE TRIGGER cc1xxxx.trg_common_insert
ON cc1xxxx.common_table
INSTEAD OF INSERT
AS
BEGIN
    INSERT INTO cc1xxxx.common_table SELECT * FROM inserted;
END;

CREATE TRIGGER cc2xxxx.trg_common_insert
ON cc2xxxx.common_table
INSTEAD OF INSERT
AS
BEGIN
    INSERT INTO cc2xxxx.common_table SELECT * FROM inserted;
END;

-- ===========================================
-- 7. 不同触发器
-- ===========================================

CREATE TRIGGER cc1xxxx.trg_custom_age
ON cc1xxxx.custom_table
AFTER UPDATE
AS
BEGIN
    SELECT 'cc1xxxx age changed from ' + CAST(deleted.age AS VARCHAR) + ' to ' + CAST(inserted.age AS VARCHAR)
    FROM inserted JOIN deleted ON inserted.id = deleted.id;
END;

CREATE TRIGGER cc2xxxx.trg_custom_age
ON cc2xxxx.custom_table
AFTER INSERT
AS
BEGIN
    SELECT 'cc2xxxx gender inserted: ' + gender FROM inserted;
END;

-- ===========================================
-- 8. 相同存储过程
-- ===========================================

CREATE PROCEDURE cc1xxxx.proc_count_common @p_count INT OUTPUT
AS
BEGIN
    SELECT @p_count = COUNT(*) FROM cc1xxxx.common_table;
END;

CREATE PROCEDURE cc2xxxx.proc_count_common @p_count INT OUTPUT
AS
BEGIN
    SELECT @p_count = COUNT(*) FROM cc2xxxx.common_table;
END;

-- ===========================================
-- 9. 不同过程
-- ===========================================

CREATE PROCEDURE cc1xxxx.proc_check_age @p_count INT OUTPUT
AS
BEGIN
    SELECT @p_count = COUNT(*) FROM cc1xxxx.custom_table WHERE age > 30;
END;

CREATE PROCEDURE cc2xxxx.proc_check_age @p_count INT OUTPUT
AS
BEGIN
    SELECT @p_count = COUNT(*) FROM cc2xxxx.custom_table WHERE gender = 'F';
END;

-- ===========================================
-- END
-- ===========================================
