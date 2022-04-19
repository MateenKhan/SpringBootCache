package com.example.project_2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping
    public String getValue(){
        System.out.println("invoked project 2");
        return "project 2 ";
    }
}
