package com.home.AlertManagementApp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "Alerts")
public class Alert {
    @Id
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
