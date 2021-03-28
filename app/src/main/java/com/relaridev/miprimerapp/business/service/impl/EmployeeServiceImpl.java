package com.relaridev.miprimerapp.business.service.impl;

import com.relaridev.miprimerapp.business.dao.EmployeeDao;
import com.relaridev.miprimerapp.business.dao.impl.EmployeeDaoImpl;
import com.relaridev.miprimerapp.business.model.business.Employee;
import com.relaridev.miprimerapp.business.service.EmployeeService;

import java.io.IOException;

public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDao employeeDao;

  public EmployeeServiceImpl() {
    this.employeeDao = new EmployeeDaoImpl();
  }

  @Override
  public void save(Employee employee) throws IOException {
    employeeDao.save(employee);
  }

}
