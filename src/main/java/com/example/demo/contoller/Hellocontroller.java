package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")

public class Hellocontroller {

    @RequestMapping("/index")
    public String index(){
        return "redirect:/hello/index2";    //リダイレクト
        //return "redirect:// コントローラー名 / メソッド名 "
    }

    @RequestMapping("/index2")

    public String index2(){
        return "hello-world";  //ここはただのフォワード
        //return html
    }

}
