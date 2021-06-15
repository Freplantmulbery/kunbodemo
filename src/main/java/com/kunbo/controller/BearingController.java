package com.kunbo.controller;

import com.kunbo.entity.Bearing;
import com.kunbo.service.BearingService;
import com.kunbo.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BearingController {

    @Autowired
    private BearingService bearingService;

    @RequestMapping(value = "/getx",method = RequestMethod.GET)
    public String getX(Model model){
        List<Bearing> x = bearingService.getX();
        List<String> out = new ArrayList<>();
        if(x != null){
            for(Bearing bear : x){
                Map<String,Object> bearingVo = new HashMap<>();
                bearingVo.put("Time", bear.getTime());
                bearingVo.put("x", bear.getX());
                String bearing = JSON.getJSONString(bearingVo);
                out.add(bearing);
            }
        }
        model.addAttribute("bearing",out);
        return "index";
    }
}
