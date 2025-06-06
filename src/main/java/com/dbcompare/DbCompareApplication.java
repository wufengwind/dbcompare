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

@Command(name = "db-compare", 
        description = "比较两个数据库的结构差异",
        version = "1.0.0",
        mixinStandardHelpOptions = true)
public class DbCompareApplication implements Callable<Integer> {

    private static final Logger logger = LoggerFactory.getLogger(DbCompareApplication.class);

    @Option(names = {"-st", "--source-type"}, description = "源数据库类型", required = true)
    private String sourceType;
    
    @Option(names = {"-su", "--source-url"}, description = "源数据库URL", required = true)
    private String sourceUrl;
    
    @Option(names = {"--source-user"}, description = "源数据库用户名", required = true)
    private String sourceUser;
    
    @Option(names = {"--source-password"}, description = "源数据库密码", required = true)
    private String sourcePassword;
    
    @Option(names = {"--source-schema"}, description = "源数据库Schema")
    private String sourceSchema;
    
    @Option(names = {"-tt", "--target-type"}, description = "目标数据库类型", required = true)
    private String targetType;
    
    @Option(names = {"-tu", "--target-url"}, description = "目标数据库URL", required = true)
    private String targetUrl;
    
    @Option(names = {"--target-user"}, description = "目标数据库用户名", required = true)
    private String targetUser;
    
    @Option(names = {"--target-password"}, description = "目标数据库密码", required = true)
    private String targetPassword;
    
    @Option(names = {"--target-schema"}, description = "目标数据库Schema")
    private String targetSchema;
    
    @Option(names = {"-i", "--include-types"}, 
            description = "要比较的对象类型 (TABLE, VIEW, PROCEDURE, FUNCTION, TRIGGER, INDEX, CONSTRAINT, SEQUENCE)", 
            split = ",")
    private String[] includeTypes;
    
    @Option(names = {"-e", "--exclude-types"}, 
            description = "要排除的对象类型 (TABLE, VIEW, PROCEDURE, FUNCTION, TRIGGER, INDEX, CONSTRAINT, SEQUENCE)", 
            split = ",")
    private String[] excludeTypes;
    
    @Option(names = {"-v", "--verbose"}, description = "输出详细信息")
    private boolean verbose = false;

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
                                 verbose);

            logger.info("数据库比较成功完成！");
            return 0;

        } catch (Exception e) {
            logger.error("数据库比较过程中发生错误: {}", e.getMessage(), e);
            return 1;
        }
    }
} 