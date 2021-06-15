package com.kunbo;

import com.kunbo.service.DianJiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DianJiTest {
    @Autowired
    private DianJiService dianJiService;
    @Test
    public void insert(){
        dianJiService.insert("123");
    }
}
