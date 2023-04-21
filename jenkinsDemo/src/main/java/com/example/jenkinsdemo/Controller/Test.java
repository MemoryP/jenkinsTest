package com.example.jenkinsdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
public class Test {

    @GetMapping("/test1")
    public String success(){
        return "成功";
    }
}
