package com.kunbo.mapper;

import com.kunbo.entity.Bearing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BearingMapper {
    //查找接口不允许对数据库进行任何更改
    //X
    List<Bearing> selectBearingX();
    //Y
    List<Bearing> selectBearingY();
    //Z
    List<Bearing> selectBearingZ();
    //全查
    List<Bearing> selectBearing();

}
