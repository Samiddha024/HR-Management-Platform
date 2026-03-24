package com.example.HRManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class service {
    List<String> EmployeeName ;

    public List<String> getEmployee() {
        EmployeeName = new ArrayList<>();
        for(int i =0;i<20 ;i++){
            EmployeeName.add("Employee" + i) ;
        }
return EmployeeName ;
    }
}
