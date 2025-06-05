@echo off
REM 简化版运行脚本

setlocal enabledelayedexpansion

echo Preparing to run Database Compare Tool...

REM 检查是否已编译
if not exist "target\classes\com\dbcompare\DbCompareApplication.class" (
    echo Classes not found. Compiling...
    mvn compile
    if !ERRORLEVEL! neq 0 (
        echo Compilation failed!
        pause
        exit /b 1
    )
)

REM 下载依赖到target/dependency目录
if not exist "target\dependency" (
    echo Downloading dependencies...
    mvn dependency:copy-dependencies -DoutputDirectory=target\dependency
)

REM 构建classpath
set CP=target\classes
for %%f in (target\dependency\*.jar) do (
    set CP=!CP!;%%f
)

echo Running application with arguments: %*
java -cp "!CP!" com.dbcompare.DbCompareApplication %*

echo.
echo Exit code: !ERRORLEVEL!
if !ERRORLEVEL! neq 0 (
    pause
) 