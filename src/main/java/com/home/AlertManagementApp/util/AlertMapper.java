package com.home.AlertManagementApp.util;

import com.home.AlertManagementApp.model.AlertInput;
import com.home.AlertManagementApp.model.Alert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlertMapper {

    AlertMapper INSTANCE = Mappers.getMapper(AlertMapper.class);

    AlertInput AlertToAlertInput(Alert alert);

    Alert AlertInputToAlert(AlertInput alertInput);
}
