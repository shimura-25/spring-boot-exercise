package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring6.processor.SpringActionTagProcessor;

import com.example.demo.DemoApplication;

import jakarta.servlet.ServletContext;

@Controller

@RequestMapping("application-scope")
public class ApplicationScopeConttoller {

    @Autowired
    private ServletContext application;

        
    @RequestMapping("/home")
    public String index(){

        Integer counter = (Integer)application.getAttribute("counter");
        if (counter == null){
            application.setAttribute("counter", 1);
        }else{
            counter++;
            application.setAttribute("counter", counter);

        }

        return "application-scope";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
