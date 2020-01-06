/*-
 * <<
 * DBus
 * ==
 * Copyright (C) 2016 - 2019 Bridata
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */


package com.creditease.dbus.common.bean;

public class FullPullHistory {
    private Long id;

    private String type;

    private String dsName;

    private String schemaName;

    private String tableName;

    private String version;

    private String batchId;

    private String state;

    private String errorMsg;

    private String initTime;

    private String startSplitTime;

    private String startPullTime;

    private String endTime;

    private String updateTime;

    private Long finishedPartitionCount;

    private Integer totalPartitionCount;

    private Long finishedRowCount;

    private Long totalRowCount;

    private String projectName;

    private String projectDisplayName;

    private Integer topologyTableId;

    private Integer targetSinkId;

    private String targetSinkTopic;

    private Long fullPullReqMsgOffset;

    private Long firstShardMsgOffset;

    private Long lastShardMsgOffset;

    private String splitColumn;

    private String fullpullCondition;

    private Long currentShardOffset;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public String getStartSplitTime() {
        return startSplitTime;
    }

    public void setStartSplitTime(String startSplitTime) {
        this.startSplitTime = startSplitTime;
    }

    public String getStartPullTime() {
        return startPullTime;
    }

    public void setStartPullTime(String startPullTime) {
        this.startPullTime = startPullTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getFinishedPartitionCount() {
        return finishedPartitionCount;
    }

    public void setFinishedPartitionCount(Long finishedPartitionCount) {
        this.finishedPartitionCount = finishedPartitionCount;
    }

    public Integer getTotalPartitionCount() {
        return totalPartitionCount;
    }

    public void setTotalPartitionCount(Integer totalPartitionCount) {
        this.totalPartitionCount = totalPartitionCount;
    }

    public Long getFinishedRowCount() {
        return finishedRowCount;
    }

    public void setFinishedRowCount(Long finishedRowCount) {
        this.finishedRowCount = finishedRowCount;
    }

    public Long getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(Long totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDisplayName() {
        return projectDisplayName;
    }

    public void setProjectDisplayName(String projectDisplayName) {
        this.projectDisplayName = projectDisplayName;
    }

    public Integer getTopologyTableId() {
        return topologyTableId;
    }

    public void setTopologyTableId(Integer topologyTableId) {
        this.topologyTableId = topologyTableId;
    }

    public Integer getTargetSinkId() {
        return targetSinkId;
    }

    public void setTargetSinkId(Integer targetSinkId) {
        this.targetSinkId = targetSinkId;
    }

    public String getTargetSinkTopic() {
        return targetSinkTopic;
    }

    public void setTargetSinkTopic(String targetSinkTopic) {
        this.targetSinkTopic = targetSinkTopic;
    }

    public Long getFullPullReqMsgOffset() {
        return fullPullReqMsgOffset;
    }

    public void setFullPullReqMsgOffset(Long fullPullReqMsgOffset) {
        this.fullPullReqMsgOffset = fullPullReqMsgOffset;
    }

    public Long getFirstShardMsgOffset() {
        return firstShardMsgOffset;
    }

    public void setFirstShardMsgOffset(Long firstShardMsgOffset) {
        this.firstShardMsgOffset = firstShardMsgOffset;
    }

    public Long getLastShardMsgOffset() {
        return lastShardMsgOffset;
    }

    public void setLastShardMsgOffset(Long lastShardMsgOffset) {
        this.lastShardMsgOffset = lastShardMsgOffset;
    }

    public String getSplitColumn() {
        return splitColumn;
    }

    public void setSplitColumn(String splitColumn) {
        this.splitColumn = splitColumn;
    }

    public String getFullpullCondition() {
        return fullpullCondition;
    }

    public void setFullpullCondition(String fullpullCondition) {
        this.fullpullCondition = fullpullCondition;
    }

    public Long getCurrentShardOffset() {
        return currentShardOffset;
    }

    public void setCurrentShardOffset(Long currentShardOffset) {
        this.currentShardOffset = currentShardOffset;
    }
}
