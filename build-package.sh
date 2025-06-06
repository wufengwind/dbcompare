#!/bin/bash

# 设置颜色输出
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
WHITE='\033[1;37m'
NC='\033[0m' # No Color

echo -e "${BLUE}==============================================================${NC}"
echo -e "${BLUE}                  数据库比较工具打包脚本                    ${NC}"
echo -e "${BLUE}                Database Compare Tool Builder              ${NC}"
echo -e "${BLUE}                      作者：吴丰                            ${NC}"
echo -e "${BLUE}==============================================================${NC}"
echo

# 检查Java环境
echo -e "${YELLOW}[信息]${NC} 检查构建环境..."

echo -e "${GREEN}[信息]${NC} 检查Java环境..."
if ! command -v java &> /dev/null; then
    echo -e "${RED}[错误]${NC} 未找到Java环境，请确保Java 11或更高版本已安装"
    echo -e "${YELLOW}[调试]${NC} 可能的原因:"
    echo -e "${YELLOW}        1. Java未安装${NC}"
    echo -e "${YELLOW}        2. Java不在PATH环境变量中${NC}"
    echo -e "${YELLOW}        3. JAVA_HOME未正确设置${NC}"
    echo
    echo -e "${CYAN}[信息]${NC} 如需安装Java，请访问: https://adoptium.net/"
    exit 1
fi
echo -e "${GREEN}[信息]${NC} Java环境检查通过"

# 检查Maven环境
echo -e "${GREEN}[信息]${NC} 检查Maven环境..."
if ! command -v mvn &> /dev/null; then
    echo -e "${RED}[错误]${NC} 未找到Maven环境，请确保Maven已安装并配置到PATH"
    echo -e "${YELLOW}[调试]${NC} 可能的原因:"
    echo -e "${YELLOW}        1. Maven未安装${NC}"
    echo -e "${YELLOW}        2. Maven不在PATH环境变量中${NC}"
    echo -e "${YELLOW}        3. JAVA_HOME未正确设置${NC}"
    echo
    echo -e "${CYAN}[信息]${NC} 如需手动安装Maven，请访问: https://maven.apache.org/download.cgi"
    exit 1
fi
echo -e "${GREEN}[信息]${NC} Maven环境检查通过"

# 检查Git环境
echo -e "${GREEN}[信息]${NC} 检查Git环境..."
if ! command -v git &> /dev/null; then
    echo -e "${RED}[错误]${NC} 未找到Git环境，请确保Git已安装并配置到PATH"
    echo -e "${YELLOW}[调试]${NC} 可能的原因:"
    echo -e "${YELLOW}        1. Git未安装${NC}"
    echo -e "${YELLOW}        2. Git不在PATH环境变量中${NC}"
    echo
    echo -e "${CYAN}[信息]${NC} 如需安装Git，请访问: https://git-scm.com/downloads"
    exit 1
fi
echo -e "${GREEN}[信息]${NC} Git环境检查通过"

echo -e "${GREEN}[信息]${NC} 所有环境检查通过"

# 显示工具路径信息
echo -e "${CYAN}[信息]${NC} 构建工具路径:"
JAVA_PATH=$(which java 2>/dev/null)
if [ -n "$JAVA_PATH" ]; then
    echo -e "${BLUE}  Java路径: $JAVA_PATH${NC}"
else
    echo -e "${YELLOW}  Java路径: 未找到${NC}"
fi

MVN_PATH=$(which mvn 2>/dev/null)
if [ -n "$MVN_PATH" ]; then
    echo -e "${BLUE}  Maven路径: $MVN_PATH${NC}"
else
    echo -e "${YELLOW}  Maven路径: 未找到${NC}"
fi

GIT_PATH=$(which git 2>/dev/null)
if [ -n "$GIT_PATH" ]; then
    echo -e "${BLUE}  Git路径: $GIT_PATH${NC}"
else
    echo -e "${YELLOW}  Git路径: 未找到${NC}"
fi

# 输入版本号
read -p "请输入版本号 (例如: 1.0.0): " VERSION
if [ -z "$VERSION" ]; then
    echo -e "${RED}[错误]${NC} 版本号不能为空"
    exit 1
fi

# 获取Git commit号
echo -e "${YELLOW}[信息]${NC} 获取Git提交信息..."
GIT_COMMIT=$(git rev-parse --short HEAD)
if [ -z "$GIT_COMMIT" ]; then
    echo -e "${RED}[错误]${NC} 无法获取Git commit信息，请确保当前目录是Git仓库"
    exit 1
fi

# 获取当前时间
BUILD_TIME=$(date "+%Y-%m-%d %H:%M:%S")
BUILD_TIMESTAMP=$(date "+%Y%m%d%H%M%S")

echo -e "${YELLOW}[信息]${NC} 构建信息:"
echo -e "${BLUE}        版本号: $VERSION${NC}"
echo -e "${BLUE}        Commit: $GIT_COMMIT${NC}"
echo -e "${BLUE}        构建时间: $BUILD_TIME${NC}"
echo

# 更新pom.xml版本号
echo -e "${YELLOW}[信息]${NC} 更新Maven版本号..."
if ! mvn versions:set -DnewVersion=$VERSION -DgenerateBackupPoms=false; then
    echo -e "${RED}[错误]${NC} 更新Maven版本号失败"
    echo -e "${YELLOW}[调试]${NC} 可能的原因:"
    echo -e "${YELLOW}        1. pom.xml文件格式错误${NC}"
    echo -e "${YELLOW}        2. 版本号格式不正确${NC}"
    echo -e "${YELLOW}        3. Maven配置问题${NC}"
    exit 1
fi
echo -e "${GREEN}[信息]${NC} Maven版本号更新成功"

# 清理旧的构建文件
echo -e "${YELLOW}[信息]${NC} 清理旧的构建文件..."
rm -rf target release

# 执行Maven构建
echo -e "${YELLOW}[信息]${NC} 开始Maven构建..."
if ! mvn clean package -DskipTests; then
    echo -e "${RED}[错误]${NC} Maven构建失败"
    echo -e "${YELLOW}[调试]${NC} 可能的原因:"
    echo -e "${YELLOW}        1. 代码编译错误${NC}"
    echo -e "${YELLOW}        2. 依赖下载失败${NC}"
    echo -e "${YELLOW}        3. 内存不足${NC}"
    exit 1
fi
echo -e "${GREEN}[信息]${NC} Maven构建成功"

# 创建发布目录
echo -e "${YELLOW}[信息]${NC} 创建发布包..."
mkdir -p release

# 复制JAR文件
cp target/db-compare-tool-$VERSION.jar release/

# 复制项目文档文件
echo -e "${YELLOW}[信息]${NC} 复制项目文档..."
DOC_FILES=("README.md" "SETUP.md" "USAGE_EXAMPLES.md" "LICENSE")
for doc_file in "${DOC_FILES[@]}"; do
    if [ -f "$doc_file" ]; then
        cp "$doc_file" release/
        echo -e "${GREEN}  已复制: $doc_file${NC}"
    else
        echo -e "${YELLOW}  跳过: $doc_file (文件不存在)${NC}"
    fi
done

# 存放压缩包的文件夹
if [ ! -d "package" ]; then
    mkdir package
fi

# 创建压缩包
PACKAGE_NAME="db-compare-tool-v$VERSION"
echo -e "${YELLOW}[信息]${NC} 创建压缩包: $PACKAGE_NAME.zip"

# 检查zip命令是否可用
if command -v zip &> /dev/null; then
    if cd release && zip -r ../package/$PACKAGE_NAME.zip . && cd ..; then
        echo -e "${GREEN}[信息]${NC} ZIP压缩包创建成功"
    else
        echo -e "${RED}[错误]${NC} 创建ZIP压缩包失败"
        exit 1
    fi
elif command -v tar &> /dev/null; then
    # 如果没有zip，使用tar.gz
    PACKAGE_NAME="$PACKAGE_NAME.tar.gz"
    if tar -czf package/$PACKAGE_NAME -C release .; then
        echo -e "${YELLOW}[信息]${NC} 使用tar.gz格式: $PACKAGE_NAME"
        echo -e "${GREEN}[信息]${NC} TAR.GZ压缩包创建成功"
    else
        echo -e "${RED}[错误]${NC} 创建TAR.GZ压缩包失败"
        exit 1
    fi
else
    echo -e "${RED}[错误]${NC} 未找到zip或tar命令，无法创建压缩包"
    echo -e "${YELLOW}[调试]${NC} 请安装zip或tar工具"
    exit 1
fi

# 获取文件大小
if [ -f "$PACKAGE_NAME" ]; then
    FILE_SIZE=$(ls -lh "package/$PACKAGE_NAME" | awk '{print $5}')
else
    FILE_SIZE="未知"
fi

echo
echo -e "${GREEN}==============================================================${NC}"
echo -e "${GREEN}                      构建成功完成！                        ${NC}"
echo -e "${GREEN}==============================================================${NC}"
echo -e "${BLUE}版本号  : $VERSION${NC}"
echo -e "${BLUE}哈希签名: $GIT_COMMIT${NC}"
echo -e "${BLUE}构建时间: $BUILD_TIME${NC}"
echo -e "${BLUE}输出文件: $PACKAGE_NAME${NC}"
echo -e "${BLUE}文件大小: $FILE_SIZE${NC}"
echo -e "${GREEN}==============================================================${NC}"

echo
echo -e "${GREEN}[信息]${NC} 发布包已创建在: $PACKAGE_NAME"
echo -e "${GREEN}[信息]${NC} 临时文件在 release 目录中"
echo
echo -e "${CYAN}[完成]${NC} 构建完成！可以分发 $PACKAGE_NAME 文件了。"
echo 

