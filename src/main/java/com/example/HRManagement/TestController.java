package com.example.HRManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/viewAll")
    public String viewAll() {
        return "Application is under progress";
    }
}
