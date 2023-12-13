package com.example.bookingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

    private final TrackingServiceClient trackingServiceClient;

    @Autowired
    public RestDemo(TrackingServiceClient trackingServiceClient) {
        this.trackingServiceClient = trackingServiceClient;
    }

    @GetMapping("/hello")
    public String getBookingMessage() {
        return "Welcome from Booking Application!" + trackingServiceClient.getHello();
    }
}
