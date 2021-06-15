package com.kunbo.controller;

import com.kunbo.entity.DianJi;
import com.kunbo.service.DianJiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dianji")
@CrossOrigin
public class DiaJiController {

    @Autowired
    private DianJiService dianJiService;

    @RequestMapping("/get")
    public List<DianJi> getAll(){
        return dianJiService.getAll();
    }

}
