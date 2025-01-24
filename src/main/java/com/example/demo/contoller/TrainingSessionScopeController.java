package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller

@RequestMapping("Training-Scope")
public class TrainingSessionScopeController {

    //sessionの準備をする
    @Autowired
    HttpSession session;

    @RequestMapping("")  //最初に動くメソッドなので名前はとりあえず無し
    public String input(){

         //入力画面にフォワード
         return "training-session-scope";  //値を戻す先のhtmlのファイル名
    }

    @RequestMapping("/input")
    public String inputNameAndPass(String name, String pass){  //フォームで入力した値（変数名を合わせる）を引数に取る

        if(name.equals("test@example.com") && pass.equals("123")){
            //String型は参照型なので＝＝ではなく.equalを使う

            session.setAttribute("name", name);
            session.setAttribute("pass", pass);

            return "training-session-scope2";

        }else{
            return "training-session-scope";
        }

        

    }

    @RequestMapping("/print")
    public String PrintProfile(){
            return "training-session-scope3";

    }


}
