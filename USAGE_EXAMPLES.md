# 使用示例

> **说明：** 报告将自动以 HTML 格式输出到 `reports` 目录，无需指定格式或输出文件名。

这里提供了数据库比较工具的详细使用示例。

## 基本使用示例

### 1. 显示帮助信息
```bash
java -jar target/db-compare-tool-1.0.0.jar --help
```

### 2. 显示版本信息
```bash
java -jar target/db-compare-tool-1.0.0.jar --version
```

## MySQL数据库比较

### 同类型数据库比较
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/source_db?useSSL=false&serverTimezone=UTC" \
  --source-user root \
  --source-password password123 \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/target_db?useSSL=false&serverTimezone=UTC" \
  --target-user root \
  --target-password password123 \
  --target-schema target_db \
  --verbose
```

### 只比较表和视图
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/db1" \
  --source-user user1 \
  --source-password pass1 \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/db2" \
  --target-user user2 \
  --target-password pass2 \
  --include-types TABLE,VIEW \
  --verbose
```

### 排除索引和约束
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/production_db" \
  --source-user prod_user \
  --source-password prod_pass \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/staging_db" \
  --target-user stage_user \
  --target-password stage_pass \
  --exclude-types INDEX,CONSTRAINT
```

## 异构数据库比较

### MySQL vs Oracle
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://mysql-server:3306/app_db" \
  --source-user mysql_user \
  --source-password mysql_pass \
  --target-type ORACLE \
  --target-url "jdbc:oracle:thin:@oracle-server:1521:XE" \
  --target-user oracle_user \
  --target-password oracle_pass \
  --target-schema HR \
  --verbose
```

### MySQL vs SQL Server
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/legacy_db" \
  --source-user root \
  --source-password password \
  --target-type SQLSERVER \
  --target-url "jdbc:sqlserver://sqlserver:1433;databaseName=new_db" \
  --target-user sa \
  --target-password SqlServerPass123 \
  --include-types TABLE,VIEW,PROCEDURE 
```

## 常见使用场景

### 1. 数据库迁移验证
在数据库迁移后验证结构是否一致：
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://old-server:3306/app_db" \
  --source-user migrator \
  --source-password migrate123 \
  --target-type POSTGRESQL \
  --target-url "jdbc:postgresql://new-server:5432/app_db" \
  --target-user migrator \
  --target-password migrate123 \
  --verbose
```

### 2. 环境同步检查
检查开发环境和生产环境的差异：
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://dev-db:3306/app" \
  --source-user dev_user \
  --source-password dev_pass \
  --target-type MYSQL \
  --target-url "jdbc:mysql://prod-db:3306/app" \
  --target-user prod_user \
  --target-password prod_pass \
  --exclude-types INDEX \
  --verbose
```

### 3. 版本发布前检查
在发布前检查数据库结构变更：
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://current-prod:3306/app" \
  --source-user readonly \
  --source-password readonly123 \
  --target-type MYSQL \
  --target-url "jdbc:mysql://staging:3306/app" \
  --target-user readonly \
  --target-password readonly123 \
  --include-types TABLE,VIEW,PROCEDURE,FUNCTION \
  --verbose
```

### 4. 数据库备份验证
验证备份恢复后的数据库结构：
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://original:3306/production" \
  --source-user backup_user \
  --source-password backup_pass \
  --target-type MYSQL \
  --target-url "jdbc:mysql://restored:3306/production" \
  --target-user backup_user \
  --target-password backup_pass \
  --verbose
```

## 性能优化建议

### 大型数据库优化
对于包含大量对象的数据库：

1. **限制比较对象类型**：
```bash
--include-types TABLE,VIEW  # 只比较表和视图
```

2. **增加JVM内存**：
```bash
java -Xmx4g -jar target/db-compare-tool-1.0.0.jar [其他参数...]
```

3. **使用详细模式查看进度**：
```bash
--verbose  # 显示详细进度信息
```

## 批处理脚本示例

### Windows批处理
```batch
@echo off
set JAR_FILE=target\db-compare-tool-1.0.0.jar
set SOURCE_DB=jdbc:mysql://localhost:3306/source_db
set TARGET_DB=jdbc:mysql://localhost:3306/target_db

echo Comparing databases...
java -jar %JAR_FILE% ^
  --source-type MYSQL ^
  --source-url "%SOURCE_DB%" ^
  --source-user root ^
  --source-password password ^
  --target-type MYSQL ^
  --target-url "%TARGET_DB%" ^
  --target-user root ^
  --target-password password
```

### Linux Shell脚本
```bash
#!/bin/bash
JAR_FILE="target/db-compare-tool-1.0.0.jar"
SOURCE_DB="jdbc:mysql://localhost:3306/source_db"
TARGET_DB="jdbc:mysql://localhost:3306/target_db"

echo "Comparing databases..."
java -jar "$JAR_FILE" \
  --source-type MYSQL \
  --source-url "$SOURCE_DB" \
  --source-user root \
  --source-password password \
  --target-type MYSQL \
  --target-url "$TARGET_DB" \
  --target-user root \
  --target-password password \
  --verbose

if [ $? -eq 0 ]; then
    echo "Comparison completed successfully!"
else
    echo "Comparison failed!"
    exit 1
fi
```

## 故障排除

### 常见错误和解决方案

1. **连接超时**：
```bash
# 增加连接超时参数
--source-url "jdbc:mysql://localhost:3306/db?connectTimeout=60000&socketTimeout=60000"
```

2. **内存不足**：
```bash
# 增加堆内存
java -Xmx2g -jar target/db-compare-tool-1.0.0.jar [参数...]
```

3. **权限不足**：
确保数据库用户具有以下权限：
- SELECT权限（读取表数据）
- INFORMATION_SCHEMA访问权限（读取元数据）
- SHOW权限（获取DDL信息）

4. **字符编码问题**：
```bash
# 指定字符编码
java -Dfile.encoding=UTF-8 -jar target/db-compare-tool-1.0.0.jar [参数...]
``` 