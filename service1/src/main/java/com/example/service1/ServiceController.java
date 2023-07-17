package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class ServiceController {

    @GetMapping("/msg")
    public String getMessage(){
        return "Message from service1";
    }
}
