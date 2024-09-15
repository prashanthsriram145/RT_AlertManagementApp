package com.home.AlertManagementApp.controller;

import com.home.AlertManagementApp.model.Alert;
import com.home.AlertManagementApp.model.AlertInput;
import com.home.AlertManagementApp.service.AlertsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("alerts")
public class AlertsController {

    private AlertsService alertsService;

    public AlertsController(AlertsService alertsService) {
        this.alertsService = alertsService;
    }

    @PostMapping(path = "/createAlert")
    public ResponseEntity<Alert> createAlert(@RequestBody AlertInput alert) {
        try {
            Alert createdAlert = alertsService.createAlert(alert);
            return ResponseEntity.ok(createdAlert);
        } catch (Exception ex) {
            return  ResponseEntity.internalServerError().body(null);
        }
    }
}
