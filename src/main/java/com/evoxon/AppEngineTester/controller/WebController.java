package com.evoxon.AppEngineTester.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class WebController {

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }
}
