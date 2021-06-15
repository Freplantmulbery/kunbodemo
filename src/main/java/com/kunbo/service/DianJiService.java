package com.kunbo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kunbo.entity.DianJi;
import com.kunbo.mapper.DianJiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DianJiService {

    @Autowired
    private DianJiMapper dianJiMapper;



    public List<DianJi> getAll(){
        return dianJiMapper.selectAll();
    }

    public int insert(String speed){
        Map<String, Object> data = JSON.parseObject(speed);
//        String lastTime = jsonObject.getString("lastTime");
        System.out.println("+++++++++++++++++");
        System.out.println(data);
        System.out.println(data.get("lastTime"));
        System.out.println(speed);
        System.out.println("+++++++++++++++++");
        return 0;

    }

}
