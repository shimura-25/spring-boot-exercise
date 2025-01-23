package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm;


@Controller
@RequestMapping("/receive")

public class ReceiveController {

    @RequestMapping("")
    public String index(){
        return "info-form";
        
    }

    @RequestMapping("/receive-info")    //メソッドの名前。info-form.htmlで使用

    public String receiveInfo(ReceiveForm receiveForm){

        //ReceiveForm.javaのgetメソッド
        System.out.println(receiveForm.getName());
        System.out.println(receiveForm.getAge());

        return "finished";
    }
}
