package com.example.Springsecuritysection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("Controllers")
//if the controller or any other package is outside of com.example.Springsecuritysection1Application
//then you need to add component scan so that it will scan the controllers packge
//and classes in it
public class Springsecuritysection1Application {

	public static void main(String[] args) {


        SpringApplication.run(Springsecuritysection1Application.class, args);

        System.out.println("Spring boot application is running");
	}

}
