package com.springboot.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class indexController {

    /*模板使用*/
    @RequestMapping("index")
    public  String index(Model model){
        model.addAttribute("hello","aaa");
        return  "index";
    }
}
