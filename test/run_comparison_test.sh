#!/bin/bash

# ===============================================
# 数据库比较测试脚本 (Linux/Mac版本)
# 自动运行源数据库和目标数据库的比较测试
# ===============================================

echo "==============================================="
echo "数据库比较工具 - 测试脚本"
echo "==============================================="
echo

# 设置默认参数
JAR_FILE="../target/db-compare-tool-1.0.0.jar"
SOURCE_DB="jdbc:mysql://localhost:3306/source_db?useSSL=false&serverTimezone=UTC"
TARGET_DB="jdbc:mysql://localhost:3306/target_db?useSSL=false&serverTimezone=UTC"
DB_USER="root"
DB_PASSWORD="root"

# 检查JAR文件是否存在
if [ ! -f "$JAR_FILE" ]; then
    echo "错误: JAR文件不存在: $JAR_FILE"
    echo "请先执行 mvn package 构建项目"
    exit 1
fi

echo "当前配置:"
echo "- 源数据库: $SOURCE_DB"
echo "- 目标数据库: $TARGET_DB"
echo "- 用户名: $DB_USER"
echo "- 密码: $DB_PASSWORD"
echo

# 询问用户是否要修改连接参数
read -p "是否要修改数据库连接参数? (y/N): " change_config
if [[ "$change_config" == "y" || "$change_config" == "Y" ]]; then
    read -p "请输入数据库用户名 [$DB_USER]: " new_user
    if [ ! -z "$new_user" ]; then
        DB_USER="$new_user"
    fi
    
    read -p "请输入数据库密码 [$DB_PASSWORD]: " new_password
    if [ ! -z "$new_password" ]; then
        DB_PASSWORD="$new_password"
    fi
    
    read -p "请输入MySQL主机地址 [localhost]: " mysql_host
    if [ -z "$mysql_host" ]; then
        mysql_host="localhost"
    fi
    
    read -p "请输入MySQL端口 [3306]: " mysql_port
    if [ -z "$mysql_port" ]; then
        mysql_port="3306"
    fi
    
    SOURCE_DB="jdbc:mysql://${mysql_host}:${mysql_port}/source_db?useSSL=false&serverTimezone=UTC"
    TARGET_DB="jdbc:mysql://${mysql_host}:${mysql_port}/target_db?useSSL=false&serverTimezone=UTC"
fi

# 创建测试结果目录
mkdir -p test_results

echo
echo "==============================================="
echo "测试1: 完整比较 (所有对象类型)"
echo "==============================================="

java -jar "$JAR_FILE" \
  --source-type MYSQL \
  --source-url "$SOURCE_DB" \
  --source-user "$DB_USER" \
  --source-password "$DB_PASSWORD" \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "$TARGET_DB" \
  --target-user "$DB_USER" \
  --target-password "$DB_PASSWORD" \
  --target-schema target_db \
  --output test_results/full_comparison.txt \
  --format TXT \
  --verbose

if [ $? -eq 0 ]; then
    echo "测试1完成: 完整比较成功"
else
    echo "测试1失败: 完整比较出错"
fi

echo
echo "==============================================="
echo "测试2: 只比较表和视图"
echo "==============================================="

java -jar "$JAR_FILE" \
  --source-type MYSQL \
  --source-url "$SOURCE_DB" \
  --source-user "$DB_USER" \
  --source-password "$DB_PASSWORD" \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "$TARGET_DB" \
  --target-user "$DB_USER" \
  --target-password "$DB_PASSWORD" \
  --target-schema target_db \
  --include-types TABLE,VIEW \
  --output test_results/tables_views_comparison.txt \
  --format TXT \
  --verbose

if [ $? -eq 0 ]; then
    echo "测试2完成: 表和视图比较成功"
else
    echo "测试2失败: 表和视图比较出错"
fi

echo
echo "==============================================="
echo "测试3: 排除索引和约束的比较"
echo "==============================================="

java -jar "$JAR_FILE" \
  --source-type MYSQL \
  --source-url "$SOURCE_DB" \
  --source-user "$DB_USER" \
  --source-password "$DB_PASSWORD" \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "$TARGET_DB" \
  --target-user "$DB_USER" \
  --target-password "$DB_PASSWORD" \
  --target-schema target_db \
  --exclude-types INDEX,CONSTRAINT \
  --output test_results/no_index_constraint_comparison.txt \
  --format TXT \
  --verbose

if [ $? -eq 0 ]; then
    echo "测试3完成: 排除索引约束比较成功"
else
    echo "测试3失败: 排除索引约束比较出错"
fi

echo
echo "==============================================="
echo "测试4: 生成HTML报告"
echo "==============================================="

java -jar "$JAR_FILE" \
  --source-type MYSQL \
  --source-url "$SOURCE_DB" \
  --source-user "$DB_USER" \
  --source-password "$DB_PASSWORD" \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "$TARGET_DB" \
  --target-user "$DB_USER" \
  --target-password "$DB_PASSWORD" \
  --target-schema target_db \
  --output test_results/comparison_report.html \
  --format HTML \
  --verbose

if [ $? -eq 0 ]; then
    echo "测试4完成: HTML报告生成成功"
else
    echo "测试4失败: HTML报告生成出错"
fi

echo
echo "==============================================="
echo "测试5: 只比较存储过程和函数"
echo "==============================================="

java -jar "$JAR_FILE" \
  --source-type MYSQL \
  --source-url "$SOURCE_DB" \
  --source-user "$DB_USER" \
  --source-password "$DB_PASSWORD" \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "$TARGET_DB" \
  --target-user "$DB_USER" \
  --target-password "$DB_PASSWORD" \
  --target-schema target_db \
  --include-types PROCEDURE,FUNCTION \
  --output test_results/procedures_functions_comparison.txt \
  --format TXT \
  --verbose

if [ $? -eq 0 ]; then
    echo "测试5完成: 存储过程和函数比较成功"
else
    echo "测试5失败: 存储过程和函数比较出错"
fi

echo
echo "==============================================="
echo "所有测试完成!"
echo "==============================================="
echo "测试结果保存在 test_results 目录中:"
echo "- full_comparison.txt           : 完整比较结果"
echo "- tables_views_comparison.txt   : 表和视图比较结果"
echo "- no_index_constraint_comparison.txt : 排除索引约束比较结果"
echo "- comparison_report.html        : HTML格式报告"
echo "- procedures_functions_comparison.txt : 存储过程和函数比较结果"
echo

# 检查是否要打开HTML报告
read -p "是否要打开HTML报告? (y/N): " open_html
if [[ "$open_html" == "y" || "$open_html" == "Y" ]]; then
    if [ -f "test_results/comparison_report.html" ]; then
        # 尝试不同的浏览器命令
        if command -v xdg-open > /dev/null; then
            xdg-open test_results/comparison_report.html
        elif command -v open > /dev/null; then
            open test_results/comparison_report.html
        else
            echo "请手动打开文件: test_results/comparison_report.html"
        fi
    else
        echo "HTML报告文件不存在"
    fi
fi

echo
echo "测试脚本执行完成!" 