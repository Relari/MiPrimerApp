package com.relaridev.miprimerapp.business.model.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

  private String name;

  private String position;

  private String sex;

  private Double salary;

}
