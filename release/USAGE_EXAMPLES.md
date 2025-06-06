# 使用示例

这里提供了数据库比较工具的详细使用示例。

## 基本用法

比较两个MySQL数据库：
```bash
java -jar db-compare-tool.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/source_db" \
  --source-user root \
  --source-password password \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/target_db" \
  --target-user root \
  --target-password password
```

## 高级用法

### 指定Schema
```bash
java -jar db-compare-tool.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/testdb" \
  --source-user root \
  --source-password password \
  --source-schema schema1 \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/testdb" \
  --target-user root \
  --target-password password \
  --target-schema schema2
```

### 只比较特定类型的对象
```bash
java -jar db-compare-tool.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/db1" \
  --source-user root \
  --source-password password \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/db2" \
  --target-user root \
  --target-password password \
  --include-types TABLE,VIEW,PROCEDURE
```

### 排除特定类型的对象
```bash
java -jar db-compare-tool.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/db1" \
  --source-user root \
  --source-password password \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/db2" \
  --target-user root \
  --target-password password \
  --exclude-types INDEX,CONSTRAINT
```

## 输出说明

程序会在当前目录下的 `reports` 文件夹中生成HTML格式的比较报告，文件名格式为：
```
reports/db_compare_YYYYMMDD_HHMMSS.html
```

报告包含：
- 基本信息（比较时间、数据库信息等）
- 对象统计（按类型统计对象数量）
- 比较结果摘要
- 详细对比信息（包括DDL差异）

## 支持的数据库类型

- MYSQL
- ORACLE
- SQLSERVER
- POSTGRESQL
- DB2
- DM8

## 注意事项

1. 确保有足够的权限访问源和目标数据库
2. 建议使用 `--verbose` 参数获取更详细的比较信息
3. 报告文件会自动生成在 reports 目录下，无需手动指定
4. 如果不指定 schema，将使用数据库默认 schema

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
  --output mysql_to_oracle_migration.json \
  --format JSON \
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
  --include-types TABLE,VIEW,PROCEDURE \
  --output migration_report.html \
  --format HTML
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
  --output migration_verification.html \
  --format HTML \
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
  --output dev_vs_prod.txt \
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
  --output release_changes.html \
  --format HTML \
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
  --output backup_verification.txt \
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
  --target-password password ^
  --output daily_comparison.html ^
  --format HTML ^
  --verbose

if %ERRORLEVEL% equ 0 (
    echo Comparison completed successfully!
) else (
    echo Comparison failed!
)
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
  --output "daily_comparison_$(date +%Y%m%d).html" \
  --format HTML \
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