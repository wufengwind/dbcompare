#!/bin/bash
# Database Compare Tool 运行示例脚本（Linux/Unix）

echo "Building the project..."
mvn clean package -DskipTests

if [ ! -f "target/db-compare-tool-1.0.0.jar" ]; then
    echo "Build failed! Please check the build output."
    exit 1
fi

echo "Running database comparison..."

# 示例1: MySQL之间的比较
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/source_db?useSSL=false&serverTimezone=UTC" \
  --source-user root \
  --source-password password \
  --source-schema source_db \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/target_db?useSSL=false&serverTimezone=UTC" \
  --target-user root \
  --target-password password \
  --target-schema target_db \
  --output comparison_report.txt \
  --format TXT \
  --verbose

echo "Comparison completed! Check comparison_report.txt for results." 