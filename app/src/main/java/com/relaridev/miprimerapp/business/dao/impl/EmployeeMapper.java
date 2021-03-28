package com.relaridev.miprimerapp.business.dao.impl;

import com.relaridev.miprimerapp.business.model.business.Employee;
import com.relaridev.miprimerapp.business.model.entity.EmployeeEntity;

public class EmployeeMapper {

    public Employee mapEmployee(EmployeeEntity employeeEntity) {
        return Employee.builder()
                .position(employeeEntity.getPosition())
                .name(employeeEntity.getName())
                .sex(employeeEntity.getSex())
                .status(employeeEntity.getStatus())
                .salary(employeeEntity.getSalary())
                .build();
    }

    public EmployeeEntity mapEmployeeEntity(Employee employee) {
        return EmployeeEntity.builder()
                .position(employee.getPosition())
                .name(employee.getName())
                .sex(employee.getSex())
                .status(employee.getStatus())
                .salary(employee.getSalary())
                .build();
    }
}
