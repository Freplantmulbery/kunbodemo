package com.kunbo.mapper;

import com.kunbo.entity.DianJi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DianJiMapper {

    List<DianJi> selectAll();

    int insertSpeed(String speed);

}
