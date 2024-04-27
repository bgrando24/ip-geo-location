package com.example.ipgeolocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IpGeoLocationApplication {

    public static void main(String[] args) {
//        run app
        SpringApplication.run(IpGeoLocationApplication.class, args);
    }

}
