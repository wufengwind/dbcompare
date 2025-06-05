package com.dbcompare;

import com.dbcompare.config.DatabaseConfig;
import com.dbcompare.service.DatabaseCompareService;
import com.dbcompare.util.VersionInfo;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

@Command(name = "dbcompare", 
         mixinStandardHelpOptions = true, 
         version = "1.0.0",
         description = "Database schema comparison tool")
public class DbCompareApplication implements Callable<Integer> {

    private static final Logger logger = LoggerFactory.getLogger(DbCompareApplication.class);

    @Option(names = {"-st", "--source-type"}, 
            description = "Source database type (MYSQL, ORACLE, SQLSERVER, POSTGRESQL, DB2, DM8)", 
            required = true)
    private String sourceType;

    @Option(names = {"-su", "--source-url"}, 
            description = "Source database URL", 
            required = true)
    private String sourceUrl;

    @Option(names = {"-suser", "--source-user"}, 
            description = "Source database username", 
            required = true)
    private String sourceUser;

    @Option(names = {"-spwd", "--source-password"}, 
            description = "Source database password", 
            required = true)
    private String sourcePassword;

    @Option(names = {"-ss", "--source-schema"}, 
            description = "Source database schema/database name")
    private String sourceSchema;

    @Option(names = {"-tt", "--target-type"}, 
            description = "Target database type (MYSQL, ORACLE, SQLSERVER, POSTGRESQL, DB2, DM8)", 
            required = true)
    private String targetType;

    @Option(names = {"-tu", "--target-url"}, 
            description = "Target database URL", 
            required = true)
    private String targetUrl;

    @Option(names = {"-tuser", "--target-user"}, 
            description = "Target database username", 
            required = true)
    private String targetUser;

    @Option(names = {"-tpwd", "--target-password"}, 
            description = "Target database password", 
            required = true)
    private String targetPassword;

    @Option(names = {"-ts", "--target-schema"}, 
            description = "Target database schema/database name")
    private String targetSchema;

    @Option(names = {"-o", "--output"}, 
            description = "Output file path for comparison results")
    private String outputFile;

    @Option(names = {"-f", "--format"}, 
            description = "Output format (JSON, HTML, TXT)", 
            defaultValue = "TXT")
    private String outputFormat;

    @Option(names = {"-i", "--include-types"}, 
            description = "Include only specific object types (TABLE, VIEW, PROCEDURE, FUNCTION, TRIGGER, INDEX, CONSTRAINT, SEQUENCE, SYNONYM)",
            split = ",")
    private String[] includeTypes;

    @Option(names = {"-e", "--exclude-types"}, 
            description = "Exclude specific object types",
            split = ",")
    private String[] excludeTypes;

    @Option(names = {"-v", "--verbose"}, 
            description = "Enable verbose output")
    private boolean verbose;

    public static void main(String[] args) {
        // 显示软件落款信息
        VersionInfo.printBanner();
        
        int exitCode = new CommandLine(new DbCompareApplication()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        try {
            logger.info("开始数据库比较...");
            logger.info("版本信息: {}", VersionInfo.getFullVersionInfo());
            
            // Create database configurations
            DatabaseConfig sourceConfig = new DatabaseConfig(
                sourceType, sourceUrl, sourceUser, sourcePassword, sourceSchema);
            DatabaseConfig targetConfig = new DatabaseConfig(
                targetType, targetUrl, targetUser, targetPassword, targetSchema);

            // Create comparison service
            DatabaseCompareService compareService = new DatabaseCompareService();
            
            // Perform comparison
            compareService.compare(sourceConfig, targetConfig, 
                                 includeTypes, excludeTypes, 
                                 outputFile, outputFormat, verbose);

            logger.info("数据库比较成功完成！");
            return 0;

        } catch (Exception e) {
            logger.error("数据库比较过程中发生错误: {}", e.getMessage(), e);
            return 1;
        }
    }
} 