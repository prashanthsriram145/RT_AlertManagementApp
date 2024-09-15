package com.home.AlertManagementApp.controller;

import com.home.AlertManagementApp.model.Alert;
import com.home.AlertManagementApp.model.AlertInput;
import com.home.AlertManagementApp.service.AlertsService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class AlertsGraphqlController {

    private AlertsService alertsService;

    public AlertsGraphqlController(AlertsService alertsService) {
        this.alertsService = alertsService;
    }

    @MutationMapping
    public Alert createAlert(@Argument AlertInput input) {
        input.setCreatedTime(LocalDateTime.now());
        input.setDispositionTime(LocalDateTime.now());
        input.setModifiedTime(LocalDateTime.now());
        return alertsService.createAlert(input);
    }

    @QueryMapping
    public List<Alert> fetchAllAlerts() {
        return alertsService.fetchAllAlerts();
    }
}
