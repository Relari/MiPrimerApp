package com.relaridev.miprimerapp.business.dao.repository;

import com.relaridev.miprimerapp.business.model.entity.EmployeeEntity;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface EmployeeApi {

  @GET("/business/firebase/v1/employees")
  Call<List<EmployeeEntity>> findAll();

  @POST("/business/firebase/v1/employees")
  Call<Void> save(@Body EmployeeEntity employeeEntity);

}
