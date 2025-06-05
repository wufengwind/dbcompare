@echo off
REM 不使用Maven的编译脚本 - 仅用于测试编译是否正确

echo Checking Java installation...
java -version
if %ERRORLEVEL% neq 0 (
    echo Java is not installed or not in PATH!
    pause
    exit /b 1
)

echo Creating output directories...
if not exist "build\classes" mkdir build\classes
if not exist "build\lib" mkdir build\lib

echo Downloading required JARs (you need to do this manually)...
echo Please download the following JARs and place them in build\lib:
echo - picocli-4.7.4.jar
echo - slf4j-api-2.0.7.jar
echo - logback-classic-1.4.8.jar
echo - logback-core-1.4.8.jar
echo - mysql-connector-java-8.0.33.jar
echo.
echo You can download these from Maven Central Repository
echo https://repo1.maven.org/maven2/
echo.

if not exist "build\lib\picocli-4.7.4.jar" (
    echo Required JARs not found in build\lib directory!
    echo Please download them first.
    pause
    exit /b 1
)

echo Compiling Java sources...
javac -cp "build\lib\*" -d build\classes src\main\java\com\dbcompare\*.java src\main\java\com\dbcompare\config\*.java src\main\java\com\dbcompare\enums\*.java src\main\java\com\dbcompare\model\*.java src\main\java\com\dbcompare\service\*.java src\main\java\com\dbcompare\service\impl\*.java

if %ERRORLEVEL% equ 0 (
    echo Compilation successful!
    echo You can run the application with:
    echo java -cp "build\classes;build\lib\*" com.dbcompare.DbCompareApplication --help
) else (
    echo Compilation failed!
)

pause 