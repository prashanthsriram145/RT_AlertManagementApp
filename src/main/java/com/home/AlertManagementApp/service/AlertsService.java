package com.home.AlertManagementApp.service;

import com.home.AlertManagementApp.model.Alert;
import com.home.AlertManagementApp.model.AlertInput;
import com.home.AlertManagementApp.repository.AlertsRepository;
import com.home.AlertManagementApp.util.AlertMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertsService {

    private final AlertsRepository alertsRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    public AlertsService(AlertsRepository alertsRepository) {
        this.alertsRepository = alertsRepository;
    }

    public Alert createAlert(AlertInput alertInput) {
        Alert alert = modelMapper.map(alertInput, Alert.class);
        return alertsRepository.save(alert);
    }

    public List<Alert> fetchAllAlerts() {
        return alertsRepository.findAll();
    }

    public Alert findById(String alertId) {
        return alertsRepository.findById(alertId).orElse(null);
    }

}
