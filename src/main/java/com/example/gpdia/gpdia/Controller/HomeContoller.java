package com.example.gpdia.gpdia.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {
    @GetMapping(value = "/")
    public String helloworld(){
        return "Hi123";
    }
}
