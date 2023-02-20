package com.example.maybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchjobController {

    @GetMapping("/batchGet")
    public String batchGet(){
        return "this is batchGet";
    }

}
