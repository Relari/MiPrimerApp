package com.relaridev.miprimerapp.business.dao.impl;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.relaridev.miprimerapp.business.dao.EmployeeDao;
import com.relaridev.miprimerapp.business.model.business.Employee;
import com.relaridev.miprimerapp.business.model.entity.EmployeeEntity;
import com.relaridev.miprimerapp.config.RestConfiguration;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeDaoImpl implements EmployeeDao {

  private RestConfiguration restConfiguration;

  public EmployeeDaoImpl() {
    this.restConfiguration = new RestConfiguration();
  }

  @Override
  public void save(Employee employee) {

    EmployeeEntity employeeEntity = new EmployeeMapper().mapEmployeeEntity(employee);
    restConfiguration.employeeRepository().save(employeeEntity)
            .enqueue(new Callback<Void>() {
              public void onResponse(
                      @NonNull Call<Void> call, @NonNull Response<Void> response) {

                if(response.isSuccessful()) {
                  Log.i("SAVE", new Gson().toJson(employeeEntity));
                }

              }

              public void onFailure(
                      @NonNull Call<Void> call, @NonNull Throwable t) {

                t.printStackTrace();

              } });

  }

}
