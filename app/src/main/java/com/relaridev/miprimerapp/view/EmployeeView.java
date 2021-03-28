package com.relaridev.miprimerapp.view;

import com.relaridev.miprimerapp.business.model.api.EmployeeRequest;
import com.relaridev.miprimerapp.business.model.api.EmployeeResponse;
import com.relaridev.miprimerapp.business.model.business.Employee;
import com.relaridev.miprimerapp.business.service.EmployeeService;
import com.relaridev.miprimerapp.business.service.impl.EmployeeServiceImpl;

import java.io.IOException;

public class EmployeeView {

  private EmployeeService employeeService;

  public EmployeeView() {
      this.employeeService = new EmployeeServiceImpl();
  }

  private EmployeeResponse mapEmployeeResponse(Employee employee) {
    return EmployeeResponse.builder()
            .position(employee.getPosition())
            .name(employee.getName())
            .sex(employee.getSex())
            .status(employee.getStatus())
            .salary(employee.getSalary())
            .build();
  }

  private Employee mapEmployee(EmployeeRequest employeeRequest) {
    return Employee.builder()
            .position(employeeRequest.getPosition())
            .name(employeeRequest.getName())
            .sex(employeeRequest.getSex())
            .status(Boolean.TRUE)
            .salary(employeeRequest.getSalary())
            .build();
  }

  public void save(EmployeeRequest employeeRequest) throws IOException {

    Employee employee = mapEmployee(employeeRequest);
    employeeService.save(employee);

  }

}
