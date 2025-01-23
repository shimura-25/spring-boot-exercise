package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestScope")
public class RequestScopeController {

    @RequestMapping("")
    public String hoge(){
        return "request-scope-form";    //遷移先のformを指定
    }

    @RequestMapping("input")  //htmlと合わせる
    public String input(String name, Model model){

        model.addAttribute("hogehoge", name);  //左がキー

        return "result-request-scope";



    }

}
