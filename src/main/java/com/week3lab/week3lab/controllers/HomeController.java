package com.week3lab.week3lab.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hello World, Kwasi Sakyi Baidoo: Deployed with AWS Elastic Beanstalk";
    }
    
}
