package com.dbcompare.util;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

/**
 * 版本信息管理类
 * 
 * @author 吴丰
 */
public class VersionInfo {
    
    private static final String AUTHOR = "吴丰";
    private static final String VERSION_PROPERTIES = "version.properties";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    private static String version;
    private static String gitCommit;
    private static String buildTime;
    private static String javaVersion;
    
    static {
        loadVersionInfo();
    }
    
    private static void loadVersionInfo() {
        Properties props = new Properties();
        try (InputStream is = VersionInfo.class.getClassLoader().getResourceAsStream(VERSION_PROPERTIES)) {
            if (is != null) {
                props.load(is);
                version = props.getProperty("version", "1.0.0");
                gitCommit = props.getProperty("git.commit", "unknown");
                buildTime = props.getProperty("build.time", getCurrentTime());
                javaVersion = props.getProperty("java.version", "unknown");
            } else {
                // 如果没有找到properties文件，使用默认值
                version = "1.0.0";
                gitCommit = "unknown";
                buildTime = getCurrentTime();
                javaVersion = "unknown";
            }
        } catch (IOException e) {
            // 使用默认值
            version = "1.0.0";
            gitCommit = "unknown";  
            buildTime = getCurrentTime();
            javaVersion = "unknown";
        }
    }
    
    private static String getCurrentTime() {
        return LocalDateTime.now().format(FORMATTER);
    }
    
    public static String getAuthor() {
        return AUTHOR;
    }
    
    public static String getVersion() {
        return version;
    }
    
    public static String getGitCommit() {
        return gitCommit;
    }
    
    public static String getBuildTime() {
        return buildTime;
    }
    
    public static String getFullVersionInfo() {
        return String.format("数据库比较工具 v%s | 作者：%s | 构建号：%s | 构建时间：%s | JDK：%s", 
                           version, AUTHOR, gitCommit, buildTime, javaVersion);
    }
    
    public static String getJavaVersion() {
        return javaVersion;
    }
    
    public static String getShortVersionInfo() {
        return String.format("v%s by %s", version, AUTHOR);
    }
    
    public static String getCopyrightInfo() {
        int currentYear = LocalDateTime.now().getYear();
        return String.format("Copyright © %d %s. All rights reserved.", currentYear, AUTHOR);
    }
    
    public static void printBanner() {
        System.out.println("********************** 构建信息 **********************");
        System.out.println("软件名称: 数据库比较工具");
        System.out.println("软件版本: v" + version);
        System.out.println("软件作者: " + AUTHOR);
        System.out.println("哈希签名: " + gitCommit);
        System.out.println("构建时间: " + buildTime);
        System.out.println("编译环境: JDK " + javaVersion);
        System.out.println("******************************************************");
    }
} 