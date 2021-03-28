package com.relaridev.miprimerapp.business.service;

import com.relaridev.miprimerapp.business.model.business.Employee;

import java.io.IOException;

public interface EmployeeService {

  void save(Employee employee) throws IOException;

}
