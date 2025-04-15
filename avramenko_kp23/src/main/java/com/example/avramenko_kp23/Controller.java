package com.example.avramenko_kp23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/studentName")
    public String getStudentName(){
        return "Avramenko Yevhen KP-23";
    }
}