package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-scope")  
public class SessionScopeController {

    @Autowired
    //sessionをつくる準備のコード
    HttpSession session;

    @RequestMapping("")
    public String index(){

        //入力画面にフォワード
        return "session-scope-form";  //値を戻す先のhtmlのファイル名
    }

    @RequestMapping("/input-name")
    public String inputName(String name){  //フォームで入力した値（変数名を合わせる）を引数に取る

        session.setAttribute("name", name);  //引数をもらってキーをつける

        return "result-session-scope1";
    }

    @RequestMapping("/to-page2")    //マッピング
    public String toPage2(){
        //フォワード（遷移先のhtmlのファイル名を記述）
        return "result-session-scope2";

    }

    @RequestMapping("/to-page3")
    public String toPage3(){
        //フォワード
        return "result-session-scope3";

    }

}
