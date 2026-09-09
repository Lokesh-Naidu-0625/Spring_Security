package com.example.Springsecuritysection1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String function1(){
        return "you application without security is running fine";
    }

    @GetMapping("/welcome")
    public String function2(){
        return "you are able to access the end points";
    }

//    now we have added the security dependency in pom.xml

}
