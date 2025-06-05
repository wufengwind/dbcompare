# 数据库比较工具 - 测试脚本说明

这个目录包含了完整的MySQL数据库测试脚本，用于验证数据库比较工具的功能。

## 📁 文件说明

### 数据库脚本
- **`source_db.sql`** - 源数据库测试脚本
- **`target_db.sql`** - 目标数据库测试脚本

### 测试运行脚本
- **`run_comparison_test.bat`** - Windows批处理测试脚本
- **`run_comparison_test.sh`** - Linux/Mac Shell测试脚本

## 🗄️ 测试数据库结构

### 📊 对象类型覆盖

测试脚本涵盖了以下数据库对象类型：

| 对象类型 | 源数据库 | 目标数据库 | 说明 |
|---------|---------|-----------|------|
| **表 (TABLE)** | 5个表 | 6个表 | 包含相同、不同结构和独有的表 |
| **视图 (VIEW)** | 3个视图 | 4个视图 | 包含相同、不同逻辑和独有的视图 |
| **存储过程 (PROCEDURE)** | 3个过程 | 4个过程 | 包含相同、不同逻辑和独有的过程 |
| **函数 (FUNCTION)** | 3个函数 | 4个函数 | 包含相同、不同逻辑和独有的函数 |
| **触发器 (TRIGGER)** | 3个触发器 | 4个触发器 | 包含相同、不同逻辑和独有的触发器 |
| **索引 (INDEX)** | 5个索引 | 4个索引 | 包含相同和不同的索引 |
| **约束 (CONSTRAINT)** | 多个约束 | 多个约束 | 包含相同和不同的约束 |

### 🔍 比较场景设计

#### 1. 相同对象
这些对象在两个数据库中完全相同，用于验证工具能正确识别相同的对象：

- **表**: `users` - 用户表，完全相同的结构
- **视图**: `active_users` - 活跃用户视图，完全相同的SQL
- **存储过程**: `GetUserById` - 根据ID获取用户，完全相同的逻辑
- **函数**: `GetDiscountedPrice` - 计算折扣价格，完全相同的实现
- **触发器**: `users_updated_at` - 更新时间戳，完全相同的逻辑

#### 2. 不同对象
这些对象在两个数据库中名称相同但结构或逻辑不同：

- **表**: 
  - `products` - 目标数据库增加了 `stock_quantity`, `is_active`, `updated_at` 字段
  - `orders` - 目标数据库缺少 `status`, `total_amount` 字段
  - `categories` - 字段名完全不同，但语义相似

- **视图**:
  - `order_summary` - 计算逻辑和字段选择不同

- **存储过程**:
  - `CreateOrder` - 源数据库只计算价格，目标数据库还检查库存

- **函数**:
  - `CalculateOrderTotal` - 目标数据库增加了运费计算

- **触发器**:
  - `orders_audit` - 记录方式和内容不同

#### 3. 源数据库独有对象
这些对象只存在于源数据库，用于验证工具能正确识别单边对象：

- **表**: `source_only_table`
- **视图**: `source_only_view`
- **存储过程**: `SourceOnlyProcedure`
- **函数**: `SourceOnlyFunction`
- **触发器**: `source_only_trigger`
- **索引**: `idx_source_only`, `idx_orders_user_date`

#### 4. 目标数据库独有对象
这些对象只存在于目标数据库：

- **表**: `target_only_table`, `customer_reviews`
- **视图**: `target_only_view`, `popular_products`
- **存储过程**: `TargetOnlyProcedure`, `UpdateProductStock`
- **函数**: `TargetOnlyFunction`, `GetProductAverageRating`
- **触发器**: `target_only_trigger`, `review_validation`
- **索引**: `idx_target_only`, `idx_reviews_rating`

## 🚀 使用方法

### 前置要求

1. **MySQL服务器** 运行在本地或远程
2. **数据库比较工具** 已构建 (`mvn package`)
3. **数据库权限** 能够创建数据库和表

### 步骤1: 准备数据库

#### 使用MySQL命令行
```bash
# 连接到MySQL
mysql -u root -p

# 执行源数据库脚本
source /path/to/test/source_db.sql

# 执行目标数据库脚本
source /path/to/test/target_db.sql
```

#### 使用MySQL Workbench
1. 打开MySQL Workbench
2. 连接到MySQL服务器
3. 依次执行 `source_db.sql` 和 `target_db.sql`

### 步骤2: 运行比较测试

#### Windows用户
```cmd
cd test
run_comparison_test.bat
```

#### Linux/Mac用户
```bash
cd test
chmod +x run_comparison_test.sh
./run_comparison_test.sh
```

### 步骤3: 查看测试结果

测试完成后，结果将保存在 `test_results/` 目录中：

```
test_results/
├── full_comparison.txt                  # 完整比较结果
├── tables_views_comparison.txt          # 表和视图比较结果
├── no_index_constraint_comparison.txt   # 排除索引约束比较结果
├── comparison_report.html               # HTML格式报告
└── procedures_functions_comparison.txt  # 存储过程和函数比较结果
```

## 📋 测试用例

测试脚本会执行以下5个测试用例：

### 测试1: 完整比较
- **目的**: 测试所有对象类型的比较
- **参数**: 包含所有对象类型
- **输出**: `full_comparison.txt`

### 测试2: 表和视图比较
- **目的**: 测试特定对象类型过滤
- **参数**: `--include-types TABLE,VIEW`
- **输出**: `tables_views_comparison.txt`

### 测试3: 排除索引和约束
- **目的**: 测试对象类型排除功能
- **参数**: `--exclude-types INDEX,CONSTRAINT`
- **输出**: `no_index_constraint_comparison.txt`

### 测试4: HTML报告生成
- **目的**: 测试HTML格式输出
- **参数**: `--format HTML`
- **输出**: `comparison_report.html`

### 测试5: 存储过程和函数
- **目的**: 测试代码对象比较
- **参数**: `--include-types PROCEDURE,FUNCTION`
- **输出**: `procedures_functions_comparison.txt`

## 🎯 预期结果

根据测试数据设计，预期的比较结果应该包含：

### 统计摘要
- **相同对象**: 约5-6个
- **不同对象**: 约5-6个  
- **仅源数据库**: 约5-6个
- **仅目标数据库**: 约6-8个

### 具体差异
1. **表结构差异**: products, orders, categories表
2. **视图逻辑差异**: order_summary视图
3. **存储过程逻辑差异**: CreateOrder存储过程
4. **函数实现差异**: CalculateOrderTotal函数
5. **触发器逻辑差异**: orders_audit触发器

## 🛠️ 自定义测试

### 修改数据库连接
测试脚本支持自定义数据库连接参数：
- 主机地址
- 端口号
- 用户名
- 密码

### 添加测试数据
可以通过修改SQL脚本来添加更多测试数据：
1. 在 `source_db.sql` 或 `target_db.sql` 中添加新对象
2. 重新执行脚本创建数据库
3. 运行比较测试查看结果

### 测试其他数据库类型
虽然当前脚本专为MySQL设计，但可以根据需要创建其他数据库类型的测试脚本：
- Oracle
- SQL Server
- PostgreSQL
- DB2
- DM8

## 🐛 故障排除

### 常见问题

1. **连接失败**
   - 检查MySQL服务是否启动
   - 验证用户名和密码
   - 确认主机地址和端口

2. **权限不足**
   - 确保数据库用户有CREATE权限
   - 确保有SELECT权限读取INFORMATION_SCHEMA

3. **JAR文件不存在**
   - 执行 `mvn package` 构建项目
   - 检查相对路径是否正确

4. **脚本执行权限**（Linux/Mac）
   - 执行 `chmod +x run_comparison_test.sh`

### 日志查看
- 应用日志保存在 `logs/` 目录
- 详细错误信息会显示在控制台

## 📝 测试验证清单

运行测试后，请验证以下内容：

- [ ] 源数据库和目标数据库创建成功
- [ ] 5个测试用例全部执行完成
- [ ] 生成了所有预期的输出文件
- [ ] 比较结果包含相同、不同和独有对象
- [ ] HTML报告格式正确且可打开
- [ ] 中文日志输出正常显示

通过这些全面的测试脚本，您可以验证数据库比较工具的各项功能是否正常工作。 