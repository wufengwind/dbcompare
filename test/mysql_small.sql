-- ===========================================
-- 1. 创建用户并授权（如需）
-- ===========================================

CREATE DATABASE cc1xxxx;
CREATE DATABASE cc2xxxx;

-- ===========================================
-- 2. 相同表结构
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
-- 3. 不同表结构
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
-- 6. 相同触发器（简化为 INSERT 后打印）
-- ===========================================

use cc1xxxx;

CREATE TRIGGER cc1xxxx_trg_common_insert
BEFORE INSERT ON cc1xxxx.common_table
FOR EACH ROW
BEGIN
  SET @msg = CONCAT('Insert into cc1xxxx.common_table: ', NEW.id);
END;

use cc2xxxx;

CREATE TRIGGER cc1xxxx_trg_common_insert
BEFORE INSERT ON cc2xxxx.common_table
FOR EACH ROW
BEGIN
  SET @msg = CONCAT('Insert into cc1xxxx.common_table: ', NEW.id);
END;

-- ===========================================
-- 7. 不同触发器
-- ===========================================

use cc1xxxx;

CREATE TRIGGER cc1xxxx_trg_custom_age
BEFORE UPDATE ON cc1xxxx.custom_table
FOR EACH ROW
BEGIN
  SET @msg = CONCAT('cc1xxxx age changed from ', OLD.age, ' to ', NEW.age);
END;

use cc2xxxx;

CREATE TRIGGER cc1xxxx_trg_custom_age
BEFORE INSERT ON cc2xxxx.custom_table
FOR EACH ROW
BEGIN
  SET @msg = CONCAT('cc2xxxx gender inserted: ', NEW.gender);
END;

-- ===========================================
-- 8. 相同过程
-- ===========================================

use cc1xxxx;

CREATE PROCEDURE cc1xxxx.proc_count_common(OUT p_count INT)
BEGIN
  SELECT COUNT(*) INTO p_count FROM cc1xxxx.common_table;
END;

use cc2xxxx;

CREATE PROCEDURE cc2xxxx.proc_count_common(OUT p_count INT)
BEGIN
  SELECT COUNT(*) INTO p_count FROM cc2xxxx.common_table;
END;

-- ===========================================
-- 9. 不同过程
-- ===========================================

use cc1xxxx;

CREATE PROCEDURE cc1xxxx.proc_check_age(OUT p_count INT)
BEGIN
  SELECT COUNT(*) INTO p_count FROM cc1xxxx.custom_table WHERE age > 30;
END;

use cc2xxxx;

CREATE PROCEDURE cc2xxxx.proc_check_age(OUT p_count INT)
BEGIN
  SELECT COUNT(*) INTO p_count FROM cc2xxxx.custom_table WHERE gender = 'F';
END;

-- ===========================================
-- END
-- ===========================================
