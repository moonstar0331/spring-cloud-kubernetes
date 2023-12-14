package com.example.bookingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

    private Environment env;

    private final TrackingServiceClient trackingServiceClient;

    @Autowired
    public RestDemo(TrackingServiceClient trackingServiceClient, Environment env) {
        this.trackingServiceClient = trackingServiceClient;
        this.env = env;
    }

    @GetMapping("/hello")
    public String getBookingMessage() {
        return "Welcome from Booking Application!" + trackingServiceClient.getHello();
    }

    @GetMapping("/hi")
    public String getHi() {
        return env.getProperty("greeting.message");
    }
}
