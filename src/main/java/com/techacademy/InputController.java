package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false)String val, Model model) {
        model.addAttribute("val", val);
        return "input";
        }

    @PostMapping("/output")
    public String postInput(@RequestParam("val") String val, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        // confirm.htmlに画面遷移
        return "output";
    }
}
