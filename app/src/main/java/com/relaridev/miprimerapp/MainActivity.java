package com.relaridev.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.relaridev.miprimerapp.business.model.api.EmployeeRequest;
import com.relaridev.miprimerapp.view.EmployeeView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView txtName, txtPosition, txtSalary;
    Spinner txtGender;
    Button btnRegister;

    private void loadValues() {
        txtName = findViewById(R.id.txtName);
        txtPosition = findViewById(R.id.txtPosition);
        txtGender = findViewById(R.id.txtGender);
        txtSalary = findViewById(R.id.txtSalary);

        btnRegister = findViewById(R.id.btnRegister);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadValues();

        EmployeeView employeeView = new EmployeeView();

        btnRegister.setOnClickListener(v ->
                {
                    try {
                        employeeView.save(buildEmployeeRequest());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    private EmployeeRequest buildEmployeeRequest() {

        String genderCode = findByGenderDescription(txtGender.getSelectedItem().toString());

        return EmployeeRequest.builder()
                .name(txtName.getText().toString())
                .position(txtPosition.getText().toString())
                .salary(Double.valueOf(txtSalary.getText().toString()))
                .sex(genderCode)
                .build();
    }

    private String findByGenderDescription(String genderDescription)  {

        if ("Male".equals(genderDescription)) {
            return "M";
        } else {
            return "F";
        }
    }

}