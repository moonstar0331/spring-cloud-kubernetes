package com.example.trrackingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getBookingMessage(){
        return "Welcome from Tracking Application!";
    }
}
