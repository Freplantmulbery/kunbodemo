package com.kunbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String welcome(Model model){
        model.addAttribute("msg","欢迎兄dei");
        model.addAttribute("wel","给你整点好东西");
        return "welcome";
    }

}
