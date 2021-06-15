package com.kunbo.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class JSON {

    public static String getJSONString(Map<String, Object> map){
        JSONObject json = new JSONObject();
        if(map != null){
            for(String key : map.keySet()){
                json.put(key, map.get(key));
            }
        }
        return json.toJSONString();
    }

}
