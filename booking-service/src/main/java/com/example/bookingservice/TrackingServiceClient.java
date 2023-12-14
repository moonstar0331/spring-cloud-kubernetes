package com.example.bookingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "tracking-service")
public interface TrackingServiceClient {

    @GetMapping("/hello")
    String getHello();
}
