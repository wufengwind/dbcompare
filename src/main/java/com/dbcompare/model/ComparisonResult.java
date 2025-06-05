package com.dbcompare.model;

import com.dbcompare.enums.DatabaseObjectType;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Represents the result of a database comparison operation
 */
public class ComparisonResult {
    private LocalDateTime comparisonTime;
    private String sourceDatabase;
    private String targetDatabase;
    private Map<DatabaseObjectType, Integer> sourceObjectCounts;
    private Map<DatabaseObjectType, Integer> targetObjectCounts;
    private List<ObjectDifference> differences;
    private List<DatabaseObject> sourceOnlyObjects;
    private List<DatabaseObject> targetOnlyObjects;
    private List<DatabaseObject> identicalObjects;
    private List<DatabaseObject> differentObjects;

    public ComparisonResult() {
        this.comparisonTime = LocalDateTime.now();
        this.sourceObjectCounts = new HashMap<>();
        this.targetObjectCounts = new HashMap<>();
        this.differences = new ArrayList<>();
        this.sourceOnlyObjects = new ArrayList<>();
        this.targetOnlyObjects = new ArrayList<>();
        this.identicalObjects = new ArrayList<>();
        this.differentObjects = new ArrayList<>();
    }

    public LocalDateTime getComparisonTime() {
        return comparisonTime;
    }

    public void setComparisonTime(LocalDateTime comparisonTime) {
        this.comparisonTime = comparisonTime;
    }

    public String getSourceDatabase() {
        return sourceDatabase;
    }

    public void setSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
    }

    public String getTargetDatabase() {
        return targetDatabase;
    }

    public void setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
    }

    public Map<DatabaseObjectType, Integer> getSourceObjectCounts() {
        return sourceObjectCounts;
    }

    public void setSourceObjectCounts(Map<DatabaseObjectType, Integer> sourceObjectCounts) {
        this.sourceObjectCounts = sourceObjectCounts;
    }

    public Map<DatabaseObjectType, Integer> getTargetObjectCounts() {
        return targetObjectCounts;
    }

    public void setTargetObjectCounts(Map<DatabaseObjectType, Integer> targetObjectCounts) {
        this.targetObjectCounts = targetObjectCounts;
    }

    public List<ObjectDifference> getDifferences() {
        return differences;
    }

    public void setDifferences(List<ObjectDifference> differences) {
        this.differences = differences;
    }

    public List<DatabaseObject> getSourceOnlyObjects() {
        return sourceOnlyObjects;
    }

    public void setSourceOnlyObjects(List<DatabaseObject> sourceOnlyObjects) {
        this.sourceOnlyObjects = sourceOnlyObjects;
    }

    public List<DatabaseObject> getTargetOnlyObjects() {
        return targetOnlyObjects;
    }

    public void setTargetOnlyObjects(List<DatabaseObject> targetOnlyObjects) {
        this.targetOnlyObjects = targetOnlyObjects;
    }

    public List<DatabaseObject> getIdenticalObjects() {
        return identicalObjects;
    }

    public void setIdenticalObjects(List<DatabaseObject> identicalObjects) {
        this.identicalObjects = identicalObjects;
    }

    public List<DatabaseObject> getDifferentObjects() {
        return differentObjects;
    }

    public void setDifferentObjects(List<DatabaseObject> differentObjects) {
        this.differentObjects = differentObjects;
    }

    public int getTotalDifferences() {
        return sourceOnlyObjects.size() + targetOnlyObjects.size() + differentObjects.size();
    }

    public int getTotalObjects() {
        return sourceOnlyObjects.size() + targetOnlyObjects.size() + 
               identicalObjects.size() + differentObjects.size();
    }

    public boolean hasDifferences() {
        return getTotalDifferences() > 0;
    }

    public static class ObjectDifference {
        private DatabaseObject sourceObject;
        private DatabaseObject targetObject;
        private String differenceType;
        private String description;

        public ObjectDifference(DatabaseObject sourceObject, DatabaseObject targetObject, 
                              String differenceType, String description) {
            this.sourceObject = sourceObject;
            this.targetObject = targetObject;
            this.differenceType = differenceType;
            this.description = description;
        }

        public DatabaseObject getSourceObject() {
            return sourceObject;
        }

        public DatabaseObject getTargetObject() {
            return targetObject;
        }

        public String getDifferenceType() {
            return differenceType;
        }

        public String getDescription() {
            return description;
        }
    }
} 