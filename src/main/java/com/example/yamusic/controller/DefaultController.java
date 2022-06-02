package com.example.yamusic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/holle")
public class DefaultController {
    @GetMapping
    public String  sayHello(){
        return "音乐成功";
    }
}
