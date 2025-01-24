package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TrainingMainMethod")
public class TrainingMathController {

    @RequestMapping("")
    public String piyopiyo(){
        return "training-math-post";  //遷移先のform名
    }

    @RequestMapping("add")
    public String add(String first, String second, Model model){

        int intFirst = Integer.parseInt(first);
        int intSecond = Integer.parseInt(second);
        int sum = intFirst + intSecond;
        String result = Integer.toString(sum);

        model.addAttribute("firstnum", first);
        model.addAttribute("secondnum", second);

        model.addAttribute("result", result);

        return "training-math-result";
    }

    @PostMapping("/forward")
    public String forward(){
        //フォワード
        return "forward:/TrainingMainMethod";
        
    }


}
