package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/message")
    public String hello()
    {
        return "congratulation on your first java with kubernates application";
    }

}
