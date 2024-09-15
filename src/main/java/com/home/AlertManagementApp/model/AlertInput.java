package com.home.AlertManagementApp.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AlertInput {
    private String alertId;
    private String alertDescription;
    private String createdBy;
    private LocalDateTime createdTime;
    private String caseOwner;
    private LocalDateTime dispositionTime;
    private String modifiedBy;
    private LocalDateTime modifiedTime;
    private String assignedTo;
}
