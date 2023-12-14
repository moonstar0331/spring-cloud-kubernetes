package com.example.trrackingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Environment env;

    @Autowired
    public DemoController(Environment env) {
        this.env = env;
    }

    @GetMapping("/hello")
    public String getBookingMessage(){
        return "Welcome from Tracking Application!";
    }

    @GetMapping("/hi")
    public String getHi() {
        return env.getProperty("greeting.message");
    }
}
