package com.example.HRManagement;

import org.springframework.boot.autoconfigure.template.TemplateLocation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {


    @GetMapping("/view")
    public String home() {
        return "HR Management System is running";
    }

    @GetMapping("/user")
    public Map<String,String> user() {
        Map<String,String> data = new HashMap<>();
        data.put("name", "admin");
        data.put("role", "Developer");
        return data;
    }

    @GetMapping("/employee")
    public List<String> getEmployees(){
        service s = new service();
        return s.getEmployee() ;
    }
}
