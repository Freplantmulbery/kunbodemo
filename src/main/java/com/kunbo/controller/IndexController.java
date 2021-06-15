package com.kunbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String welcome(Model model){
        model.addAttribute("msg","数据页面");
        model.addAttribute("wel","查看数据");
        return "welcome";
    }

}
