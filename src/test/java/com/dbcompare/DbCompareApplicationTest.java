package com.dbcompare;

import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Basic tests for the DbCompareApplication
 */
public class DbCompareApplicationTest {

    @Test
    public void testApplicationHelp() {
        DbCompareApplication app = new DbCompareApplication();
        CommandLine cmd = new CommandLine(app);
        
        // Test that help option works
        String[] args = {"--help"};
        int exitCode = cmd.execute(args);
        assertEquals(0, exitCode);
    }

    @Test
    public void testApplicationVersion() {
        DbCompareApplication app = new DbCompareApplication();
        CommandLine cmd = new CommandLine(app);
        
        // Test that version option works
        String[] args = {"--version"};
        int exitCode = cmd.execute(args);
        assertEquals(0, exitCode);
    }

    @Test
    public void testInvalidArguments() {
        DbCompareApplication app = new DbCompareApplication();
        CommandLine cmd = new CommandLine(app);
        
        // Test with missing required arguments
        String[] args = {"--source-type", "MYSQL"};
        int exitCode = cmd.execute(args);
        assertEquals(2, exitCode); // picocli returns 2 for missing required options
    }
} 