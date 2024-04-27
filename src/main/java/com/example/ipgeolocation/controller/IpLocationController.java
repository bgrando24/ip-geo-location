package com.example.ipgeolocation.controller;

import com.example.ipgeolocation.model.IpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpLocationController {

//    get IP Geolocation
    @GetMapping("/ip")
    public IpResponse getIpLocation() {
//        send GET request to http://ip-api.com/json/{ip}
    }
}
