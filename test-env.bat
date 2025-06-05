@echo off
chcp 65001 >nul 2>&1

echo 开始环境测试...
echo.

echo 测试Java:
java -version
echo Java测试返回码: %errorlevel%
echo.

echo 测试Maven:
mvn -version
echo Maven测试返回码: %errorlevel%
echo.

echo 测试Git:
git --version
echo Git测试返回码: %errorlevel%
echo.

echo 当前工作目录: %CD%
echo.
echo 测试完成，按任意键退出...
pause >nul 