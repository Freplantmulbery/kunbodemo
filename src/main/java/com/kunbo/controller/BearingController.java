package com.kunbo.controller;

import com.kunbo.entity.Bearing;
import com.kunbo.service.BearingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BearingController {

    @Autowired
    private BearingService bearingService;

    @RequestMapping("/getx")
    public String getX(Model model){
        List<Bearing> x = bearingService.getX();
        List<Map<Float,Float>> bearing = new ArrayList<>();
        if(x != null){
            for(Bearing bear : x){
                Map<Float,Float> map = new HashMap<>();
                map.put(bear.getTime(),bear.getX());
                bearing.add(map);
            }
        }
        model.addAttribute("bearing",bearing);
        return "index";
    }
}
