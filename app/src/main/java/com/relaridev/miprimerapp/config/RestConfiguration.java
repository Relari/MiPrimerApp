package com.relaridev.miprimerapp.config;


import com.relaridev.miprimerapp.business.dao.repository.EmployeeApi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestConfiguration {

  private static final String URI = "https://employee-firebase.herokuapp.com";

  private Retrofit retrofit() {

    OkHttpClient httpClient = new OkHttpClient();
    httpClient.connectTimeoutMillis();
    httpClient.readTimeoutMillis();
    httpClient.writeTimeoutMillis();

    return new Retrofit.Builder()
        .baseUrl(URI)
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build();
  }

  public EmployeeApi employeeRepository() {
    return retrofit().create(EmployeeApi.class);
  }
}
