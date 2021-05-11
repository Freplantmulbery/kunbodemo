package com.kunbo;

import com.kunbo.entity.Bearing;
import com.kunbo.mapper.BearingMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Qualifier("dataSource")
    @Autowired
    DataSource dataSource;

    @Autowired
    private BearingMapper bearingMapper;

    @Test
    public void contextLoads() {

        List<Bearing> bearings = bearingMapper.selectBearing();
        for(Bearing bearing : bearings)
        System.out.println(bearing);
    }

    @Test
    void test() {
        System.out.println("------------------");
        System.out.println(dataSource.getClass());
        System.out.println("------------------");
    }


}
