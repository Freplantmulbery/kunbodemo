package com.kunbo.service;

import com.kunbo.entity.Bearing;
import com.kunbo.mapper.BearingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BearingService {

    @Autowired
    private BearingMapper bearingMapper;

    //得到x向的数据
    public List<Bearing> getX(){
        return bearingMapper.selectBearingX();
    }

    //得到y向的数据
    public List<Bearing> getY(){
        return bearingMapper.selectBearingY();
    }

    //得到z向的数据
    public List<Bearing> getZ(){
        return bearingMapper.selectBearingZ();
    }

    //得到全部的数据
    public List<Bearing> getAll(){
        return bearingMapper.selectBearing();
    }
}
