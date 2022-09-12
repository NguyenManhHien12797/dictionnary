package com.example.dictionnary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionnary {
    private static Map<String,String> map;
    static {
        map = new HashMap<>();
        map.put("Hello","Xin chào");
        map.put("Computer","Máy tính");
    }
    @GetMapping("/dictionnary")
    public String convert(@RequestParam String str, Model model){
       String result = map.get(str);
        model.addAttribute("rs", result);
        return "index";
    }
}
