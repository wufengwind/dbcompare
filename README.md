# Database Compare Tool

这是一个Java命令行工具，用于比较不同数据库之间的模式对象结构。

## 功能特性

- 支持多种数据库类型：MySQL、Oracle、SQL Server、PostgreSQL、DB2、DM8（达梦）
- 比较数据库对象：表、视图、存储过程、函数、触发器、索引、约束、序列、同义词
- 检测DDL结构差异
- 支持同构和异构数据库比较
- 灵活的对象类型过滤
- 多种输出格式：TXT、JSON、HTML
- 详细的比较报告

## 系统要求

- Java 11 或更高版本
- Maven 3.6 或更高版本

## 构建项目

```bash
mvn clean package
```

## 使用方法

### 基本用法

```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/source_db" \
  --source-user root \
  --source-password password \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/target_db" \
  --target-user root \
  --target-password password \
  --target-schema target_db
```

### 高级用法

```bash
# 只比较表和视图
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/source_db" \
  --source-user root \
  --source-password password \
  --target-type ORACLE \
  --target-url "jdbc:oracle:thin:@localhost:1521:XE" \
  --target-user hr \
  --target-password password \
  --include-types TABLE,VIEW \
  --output comparison_report.html \
  --format HTML \
  --verbose

# 排除索引和约束
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/db1" \
  --source-user user1 \
  --source-password pass1 \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/db2" \
  --target-user user2 \
  --target-password pass2 \
  --exclude-types INDEX,CONSTRAINT
```

## 命令行参数

### 必需参数

- `--source-type, -st`: 源数据库类型 (MYSQL, ORACLE, SQLSERVER, POSTGRESQL, DB2, DM8)
- `--source-url, -su`: 源数据库连接URL
- `--source-user, -suser`: 源数据库用户名
- `--source-password, -spwd`: 源数据库密码
- `--target-type, -tt`: 目标数据库类型
- `--target-url, -tu`: 目标数据库连接URL
- `--target-user, -tuser`: 目标数据库用户名
- `--target-password, -tpwd`: 目标数据库密码

### 可选参数

- `--source-schema, -ss`: 源数据库模式名
- `--target-schema, -ts`: 目标数据库模式名
- `--output, -o`: 输出文件路径
- `--format, -f`: 输出格式 (TXT, JSON, HTML)，默认为TXT
- `--include-types, -i`: 只包含指定的对象类型，用逗号分隔
- `--exclude-types, -e`: 排除指定的对象类型，用逗号分隔
- `--verbose, -v`: 启用详细输出
- `--help, -h`: 显示帮助信息
- `--version`: 显示版本信息

## 支持的对象类型

- `TABLE`: 数据表
- `VIEW`: 视图
- `PROCEDURE`: 存储过程
- `FUNCTION`: 函数
- `TRIGGER`: 触发器
- `INDEX`: 索引
- `CONSTRAINT`: 约束
- `SEQUENCE`: 序列
- `SYNONYM`: 同义词

## 数据库连接字符串示例

### MySQL
```
jdbc:mysql://hostname:3306/database_name?useSSL=false&serverTimezone=UTC
```

### Oracle
```
jdbc:oracle:thin:@hostname:1521:SID
jdbc:oracle:thin:@hostname:1521/service_name
```

### SQL Server
```
jdbc:sqlserver://hostname:1433;databaseName=database_name
```

### PostgreSQL
```
jdbc:postgresql://hostname:5432/database_name
```

### DB2
```
jdbc:db2://hostname:50000/database_name
```

### DM8 (达梦)
```
jdbc:dm://hostname:5236/database_name
```

## 输出报告

工具会生成详细的比较报告，包含：

1. **概要信息**：比较时间、源数据库和目标数据库信息
2. **对象统计**：各类型对象的数量统计
3. **差异详情**：
   - 仅存在于源数据库的对象
   - 仅存在于目标数据库的对象
   - 两个数据库中都存在但DDL不同的对象
   - 完全相同的对象

## 注意事项

1. **DM8驱动**: 达梦数据库驱动需要手动安装，请从达梦官网下载对应的JDBC驱动
2. **权限要求**: 确保数据库用户具有读取元数据的权限
3. **网络连接**: 确保工具能够访问源数据库和目标数据库
4. **大型数据库**: 对于大型数据库，比较过程可能需要较长时间

## 故障排除

### 常见问题

1. **连接失败**: 检查数据库URL、用户名、密码和网络连接
2. **驱动缺失**: 确保classpath中包含相应的数据库驱动
3. **权限不足**: 确保数据库用户有足够的权限访问元数据表
4. **内存不足**: 对于大型数据库，可能需要增加JVM堆内存：`java -Xmx2g -jar ...`

### 日志文件

应用程序会在 `logs/` 目录下生成日志文件，可以查看详细的错误信息和调试信息。

## 开发说明

### 项目结构

```
src/main/java/com/dbcompare/
├── DbCompareApplication.java          # 主应用程序入口
├── config/
│   └── DatabaseConfig.java           # 数据库配置类
├── enums/
│   └── DatabaseObjectType.java       # 数据库对象类型枚举
├── model/
│   ├── DatabaseObject.java           # 数据库对象模型
│   └── ComparisonResult.java         # 比较结果模型
└── service/
    ├── DatabaseMetadataExtractor.java # 元数据提取器接口
    ├── DatabaseCompareService.java    # 核心比较服务
    └── impl/
        └── MySQLMetadataExtractor.java # MySQL元数据提取器实现
```

### 扩展支持新数据库

要添加对新数据库的支持，需要：

1. 实现 `DatabaseMetadataExtractor` 接口
2. 在 `DatabaseCompareService` 中注册新的提取器
3. 在 `DatabaseConfig` 中添加对应的驱动类名

## 许可证

本项目采用 MIT 许可证。 