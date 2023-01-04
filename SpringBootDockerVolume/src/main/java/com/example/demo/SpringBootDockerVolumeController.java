package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringBootDockerVolumeController {
    @RequestMapping("/")
    public String welcome() {
        return "Spring Boot Docker Volume";
    }

    @RequestMapping("/hello")
    public String myData() {
        return "Hello Spring Boot";
    }

}