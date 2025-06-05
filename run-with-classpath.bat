@echo off
REM 使用classpath方式运行，避免JAR签名问题

echo Checking if target/classes exists...
if not exist "target\classes" (
    echo Compiled classes not found. Please compile first:
    echo mvn compile
    pause
    exit /b 1
)

echo Running with classpath...

REM 设置classpath，包含编译后的类和所有依赖
set CLASSPATH=target\classes
for %%i in (target\dependency\*.jar) do (
    set CLASSPATH=!CLASSPATH!;%%i
)

REM 如果没有dependency目录，尝试从Maven仓库获取
if not exist "target\dependency" (
    echo Downloading dependencies...
    call mvn dependency:copy-dependencies -DoutputDirectory=target\dependency
)

REM 重新设置classpath
set CLASSPATH=target\classes
for %%i in (target\dependency\*.jar) do (
    call set CLASSPATH=%%CLASSPATH%%;%%i
)

echo Running application...
java -cp "%CLASSPATH%" com.dbcompare.DbCompareApplication %*

if %ERRORLEVEL% neq 0 (
    echo.
    echo Application failed with exit code %ERRORLEVEL%
    pause
) 