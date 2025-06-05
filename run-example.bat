@echo off
REM Database Compare Tool 运行示例脚本（Windows）

echo Building the project...
call mvn clean package -DskipTests

if not exist "target\db-compare-tool-1.0.0.jar" (
    echo Build failed! Please check the build output.
    pause
    exit /b 1
)

echo Running database comparison...

REM 示例1: MySQL之间的比较
java -jar target\db-compare-tool-1.0.0.jar ^
  --source-type MYSQL ^
  --source-url "jdbc:mysql://localhost:3306/source_db?useSSL=false&serverTimezone=UTC" ^
  --source-user root ^
  --source-password password ^
  --source-schema source_db ^
  --target-type MYSQL ^
  --target-url "jdbc:mysql://localhost:3306/target_db?useSSL=false&serverTimezone=UTC" ^
  --target-user root ^
  --target-password password ^
  --target-schema target_db ^
  --output comparison_report.txt ^
  --format TXT ^
  --verbose

echo Comparison completed! Check comparison_report.txt for results.
pause 