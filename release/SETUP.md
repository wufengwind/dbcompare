# 项目设置和安装说明

## 前置要求

在运行此数据库比较工具之前，请确保您的系统已安装以下软件：

### 1. Java Development Kit (JDK) 11 或更高版本

**检查是否已安装：**
```bash
java -version
javac -version
```

**下载和安装：**
- 从 [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) 或 [OpenJDK](https://openjdk.org/) 下载
- 安装后设置 `JAVA_HOME` 环境变量

### 2. Apache Maven 3.6 或更高版本

**检查是否已安装：**
```bash
mvn --version
```

**下载和安装：**
1. 从 [Apache Maven官网](https://maven.apache.org/download.cgi) 下载
2. 解压到合适的目录（如 `C:\apache-maven-3.9.4`）
3. 设置环境变量：
   - `M2_HOME`: Maven安装目录
   - `PATH`: 添加 `%M2_HOME%\bin`（Windows）或 `$M2_HOME/bin`（Linux/Mac）

**Windows环境变量设置示例：**
```
JAVA_HOME=C:\Program Files\Java\jdk-11.0.19
M2_HOME=C:\apache-maven-3.9.4
PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%
```

## 项目构建

### 使用Maven构建（推荐）

#### 1. 编译项目
```bash
mvn clean compile
```

#### 2. 运行测试
```bash
mvn test
```

#### 3. 打包项目
```bash
mvn clean package
```

成功后会在 `target/` 目录下生成 `db-compare-tool-1.0.0.jar` 文件。

### 不使用Maven构建（备选方案）

如果您的系统没有安装Maven，可以使用以下方法：

#### Windows系统
1. 运行 `compile-without-maven.bat` 脚本
2. 按照提示下载所需的JAR文件到 `build\lib` 目录
3. 脚本会自动编译项目

#### 手动编译步骤
1. 创建目录结构：
```bash
mkdir build\classes
mkdir build\lib
```

2. 下载必需的JAR文件到 `build\lib` 目录：
   - picocli-4.7.4.jar
   - slf4j-api-2.0.7.jar
   - logback-classic-1.4.8.jar
   - logback-core-1.4.8.jar
   - mysql-connector-java-8.0.33.jar

3. 编译源代码：
```bash
javac -cp "build\lib\*" -d build\classes src\main\java\com\dbcompare\*.java src\main\java\com\dbcompare\config\*.java src\main\java\com\dbcompare\enums\*.java src\main\java\com\dbcompare\model\*.java src\main\java\com\dbcompare\service\*.java src\main\java\com\dbcompare\service\impl\*.java
```

4. 运行应用程序：
```bash
java -cp "build\classes;build\lib\*" com.dbcompare.DbCompareApplication --help
```

## 数据库驱动安装

### 自动下载的驱动
以下驱动会通过Maven自动下载：
- MySQL
- Oracle
- SQL Server
- PostgreSQL
- DB2

### 手动安装的驱动

#### DM8（达梦数据库）
1. 从 [达梦官网](https://www.dameng.com/) 下载JDBC驱动
2. 将驱动jar文件安装到本地Maven仓库：
```bash
mvn install:install-file -Dfile=DmJdbcDriver18.jar -DgroupId=com.dameng -DartifactId=DmJdbcDriver18 -Dversion=8.1.2.192 -Dpackaging=jar
```
3. 在pom.xml中添加依赖：
```xml
<dependency>
    <groupId>com.dameng</groupId>
    <artifactId>DmJdbcDriver18</artifactId>
    <version>8.1.2.192</version>
</dependency>
```

## 快速开始

### 1. 构建项目
```bash
# Windows
run-example.bat

# Linux/Mac
chmod +x run-example.sh
./run-example.sh
```

### 2. 手动运行
```bash
java -jar target/db-compare-tool-1.0.0.jar --help
```

### 3. 示例比较
```bash
java -jar target/db-compare-tool-1.0.0.jar \
  --source-type MYSQL \
  --source-url "jdbc:mysql://localhost:3306/db1" \
  --source-user root \
  --source-password password \
  --target-type MYSQL \
  --target-url "jdbc:mysql://localhost:3306/db2" \
  --target-user root \
  --target-password password \
  --verbose
```

## 故障排除

### 常见问题

1. **"mvn命令未找到"**
   - 确保Maven已正确安装并添加到PATH环境变量

2. **"java命令未找到"**
   - 确保JDK已正确安装并添加到PATH环境变量

3. **编译错误**
   - 检查JDK版本是否为11或更高
   - 确保网络连接正常，Maven能够下载依赖

4. **数据库连接失败**
   - 检查数据库URL、用户名、密码
   - 确保数据库服务正在运行
   - 检查防火墙设置

### 日志查看

应用程序会在 `logs/` 目录下生成详细的日志文件，可以帮助诊断问题。

## IDE集成

### IntelliJ IDEA
1. 打开项目目录
2. IDEA会自动识别Maven项目
3. 等待依赖下载完成
4. 运行 `DbCompareApplication.main()` 方法

### Eclipse
1. File -> Import -> Existing Maven Projects
2. 选择项目目录
3. 等待依赖下载完成
4. 右键项目 -> Run As -> Java Application

### Visual Studio Code
1. 安装Java Extension Pack
2. 打开项目目录
3. VS Code会自动识别Maven项目
4. 使用命令面板运行Java程序

## 性能优化

对于大型数据库，可以通过以下方式优化性能：

1. **增加JVM内存**
```bash
java -Xmx4g -jar target/db-compare-tool-1.0.0.jar [参数...]
```

2. **限制比较的对象类型**
```bash
--include-types TABLE,VIEW
```

3. **使用并行处理**（未来版本将支持）

## 支持和反馈

如果遇到问题或有改进建议，请：
1. 查看日志文件获取详细错误信息
2. 检查数据库连接和权限
3. 确认所有依赖已正确安装 