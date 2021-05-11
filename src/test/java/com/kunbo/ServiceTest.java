package com.kunbo;

import com.kunbo.entity.Bearing;
import com.kunbo.service.BearingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ServiceTest {

    @Autowired
    private BearingService bearingService;

    @Test
    public void getX(){
        List<Bearing> x = bearingService.getX();
        for(Bearing b : x){
            System.out.println(b);
        }
    }
}
