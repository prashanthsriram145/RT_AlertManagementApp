package com.home.AlertManagementApp.repository;

import com.home.AlertManagementApp.model.Alert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertsRepository extends MongoRepository<Alert, String> {
}
