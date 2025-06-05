# 数据库比较工具测试脚本

本目录包含了针对不同数据库类型的完整测试脚本，用于验证数据库比较工具的功能。

## 支持的数据库类型

- **MySQL** 5.7+ / 8.0+
- **Oracle** 11g+ / 12c+ / 19c+
- **SQL Server** 2012+ / 2016+ / 2019+
- **PostgreSQL** 9.6+ / 10+ / 11+ / 12+ / 13+ / 14+
- **DM8 (达梦)** 8.1+
- **IBM DB2** 11.1+ / 11.5+

## 脚本结构

每种数据库都包含源和目标数据库脚本，用于模拟实际的比较场景：

### MySQL
- `mysql_source_db.sql` - MySQL源数据库
- `mysql_target_db.sql` - MySQL目标数据库

### Oracle
- `oracle_source_db.sql` - Oracle源数据库
- `oracle_target_db.sql` - Oracle目标数据库

### SQL Server
- `sqlserver_source_db.sql` - SQL Server源数据库
- `sqlserver_target_db.sql` - SQL Server目标数据库

### PostgreSQL
- `postgresql_source_db.sql` - PostgreSQL源数据库
- `postgresql_target_db.sql` - PostgreSQL目标数据库

### DM8 (达梦)
- `dm8_source_db.sql` - DM8源数据库
- `dm8_target_db.sql` - DM8目标数据库

### DB2
- `db2_source_db.sql` - DB2源数据库
- `db2_target_db.sql` - DB2目标数据库

## 测试数据库结构

每个测试数据库都包含以下对象类型：

### 表结构
1. **users** - 用户表
2. **categories** - 商品分类表
3. **products** - 商品表
4. **orders** - 订单表
5. **source_only_table** / **target_only_table** - 仅在源/目标数据库中存在的表

### 数据库对象
- **视图 (Views)** - 3-4个视图，包括业务逻辑视图
- **存储过程 (Procedures)** - 3-4个存储过程，包含业务操作
- **函数 (Functions)** - 3-4个函数，包含计算逻辑
- **触发器 (Triggers)** - 3-4个触发器，包含审计和数据验证
- **索引 (Indexes)** - 多个索引，包含单列和复合索引
- **约束 (Constraints)** - 主键、外键、唯一约束、检查约束
- **序列 (Sequences)** - 自增序列（适用于支持的数据库）

## 设计差异

为了充分测试比较功能，目标数据库相对于源数据库具有以下差异：

### 表结构差异
- **新增字段** - 目标数据库的某些表包含额外字段
- **缺失字段** - 目标数据库的某些表缺少源数据库的字段
- **数据类型差异** - 某些字段类型在两个数据库中不同
- **约束差异** - 不同的约束定义

### 对象差异
- **仅源数据库对象** - 只存在于源数据库的对象
- **仅目标数据库对象** - 只存在于目标数据库的对象
- **修改的对象** - 相同名称但定义不同的对象
- **索引差异** - 不同的索引配置

## 使用方法

### 1. MySQL

```bash
# 创建源数据库
mysql -u root -p < mysql_source_db.sql

# 创建目标数据库
mysql -u root -p < mysql_target_db.sql

# 运行比较
java -jar db-compare-tool.jar \
  --source-url "jdbc:mysql://localhost:3306/ecommerce_source" \
  --source-user root \
  --source-password password \
  --target-url "jdbc:mysql://localhost:3306/ecommerce_target" \
  --target-user root \
  --target-password password \
  --output-file mysql_comparison_report.html \
  --format html
```

### 2. Oracle

```bash
# 使用SQL*Plus或其他Oracle客户端执行
sqlplus username/password@database @oracle_source_db.sql
sqlplus username/password@database @oracle_target_db.sql

# 运行比较
java -jar db-compare-tool.jar \
  --source-url "jdbc:oracle:thin:@localhost:1521:xe" \
  --source-user source_user \
  --source-password password \
  --target-url "jdbc:oracle:thin:@localhost:1521:xe" \
  --target-user target_user \
  --target-password password \
  --output-file oracle_comparison_report.html \
  --format html
```

### 3. SQL Server

```bash
# 使用SQLCMD或SSMS执行
sqlcmd -S localhost -E -i sqlserver_source_db.sql
sqlcmd -S localhost -E -i sqlserver_target_db.sql

# 运行比较
java -jar db-compare-tool.jar \
  --source-url "jdbc:sqlserver://localhost:1433;databaseName=ecommerce_source" \
  --source-user sa \
  --source-password password \
  --target-url "jdbc:sqlserver://localhost:1433;databaseName=ecommerce_target" \
  --target-user sa \
  --target-password password \
  --output-file sqlserver_comparison_report.html \
  --format html
```

### 4. PostgreSQL

```bash
# 创建数据库并执行脚本
createdb ecommerce_source
createdb ecommerce_target
psql -d ecommerce_source -f postgresql_source_db.sql
psql -d ecommerce_target -f postgresql_target_db.sql

# 运行比较
java -jar db-compare-tool.jar \
  --source-url "jdbc:postgresql://localhost:5432/ecommerce_source" \
  --source-user postgres \
  --source-password password \
  --target-url "jdbc:postgresql://localhost:5432/ecommerce_target" \
  --target-user postgres \
  --target-password password \
  --output-file postgresql_comparison_report.html \
  --format html
```

### 5. DM8 (达梦)

```bash
# 使用DM管理工具或disql执行
disql username/password@localhost:5236 @dm8_source_db.sql
disql username/password@localhost:5236 @dm8_target_db.sql

# 运行比较
java -jar db-compare-tool.jar \
  --source-url "jdbc:dm://localhost:5236" \
  --source-user source_user \
  --source-password password \
  --target-url "jdbc:dm://localhost:5236" \
  --target-user target_user \
  --target-password password \
  --output-file dm8_comparison_report.html \
  --format html
```

### 6. DB2

```bash
# 连接到DB2并执行脚本
db2 connect to database
db2 -td@ -f db2_source_db.sql
db2 -td@ -f db2_target_db.sql

# 运行比较
java -jar db-compare-tool.jar \
  --source-url "jdbc:db2://localhost:50000/database" \
  --source-user db2user \
  --source-password password \
  --target-url "jdbc:db2://localhost:50000/database" \
  --target-user db2user \
  --target-password password \
  --output-file db2_comparison_report.html \
  --format html
```

## 预期比较结果

运行比较后，您应该看到以下类型的差异：

### 表差异
- `users` 表：目标数据库有额外字段（birth_date, country）
- `products` 表：目标数据库有额外字段（min_stock_level, brand, weight）
- `orders` 表：目标数据库缺少字段（shipping_address, notes）
- `source_only_table`：仅存在于源数据库
- `customer_reviews`/`target_only_table`：仅存在于目标数据库

### 视图差异
- `active_users`：定义略有不同（包含的字段不同）
- `popular_products`/`target_only_view`：仅存在于目标数据库
- `source_only_view`：仅存在于源数据库

### 存储过程差异
- `GetUserById`：参数或实现略有不同
- `CreateOrder`：增强版本在目标数据库中包含库存检查
- `UpdateProductStock`/`TargetOnlyProcedure`：仅存在于目标数据库
- `SourceOnlyProcedure`：仅存在于源数据库

### 函数差异
- `GetDiscountedPrice`：默认折扣率不同（0.1 vs 0.15）
- `GetProductAverageRating`/`TargetOnlyFunction`：仅存在于目标数据库
- `SourceOnlyFunction`：仅存在于源数据库

### 索引差异
- 不同的索引组合和配置
- 某些索引仅存在于特定数据库中

## 故障排除

### 常见问题

1. **连接失败**
   - 检查数据库服务是否运行
   - 验证连接字符串格式
   - 确认用户权限

2. **SQL执行错误**
   - 检查数据库版本兼容性
   - 确认语法是否符合特定数据库要求
   - 验证用户是否有创建对象的权限

3. **编码问题**
   - 确保数据库和客户端使用UTF-8编码
   - 检查中文字符是否正确显示

### 数据库特定注意事项

#### Oracle
- 确保用户有足够的表空间配额
- 可能需要设置 `RECYCLEBIN` 为 OFF

#### SQL Server
- 确保数据库排序规则支持中文
- 可能需要启用 `SQLCMD` 模式

#### PostgreSQL
- 确保数据库编码为 UTF-8
- 可能需要安装 `plpgsql` 扩展

#### DM8
- 确保 DM8 版本支持所有使用的功能
- 检查字符集配置

#### DB2
- 设置正确的语句终止符 `@`
- 可能需要增加表空间大小

## 性能测试

这些脚本创建的对象数量适合测试比较工具的性能：

- **小规模测试**：5-6个表，20+个对象
- **中等规模**：可以通过复制脚本创建更多对象
- **大规模测试**：建议使用数据生成脚本创建数百个对象

## 扩展测试

### 添加更多测试数据

```sql
-- 可以在脚本末尾添加更多测试数据
INSERT INTO categories (name, description) VALUES 
('家电', '家用电器'),
('运动', '运动用品'),
('美妆', '化妆品');

-- 添加更多产品和订单数据
```

### 自定义测试场景

1. **模式变更测试** - 修改表结构测试DDL差异检测
2. **数据差异测试** - 添加不同的测试数据
3. **权限测试** - 测试不同用户权限下的比较
4. **大数据量测试** - 创建包含大量对象的数据库

## 贡献

如果您发现脚本中的问题或希望添加新的测试场景，请：

1. 创建 Issue 描述问题
2. 提交 Pull Request 包含修复
3. 添加相应的文档说明

## 许可证

这些测试脚本与主项目使用相同的许可证。 