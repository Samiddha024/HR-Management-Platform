package com.example.HRManagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/employee")

public class EmployeeController {

    @GetMapping("/emp")
    public List<String> getEmployees(){
        service s = new service();
        return s.getEmployee() ;
    }
    
}
