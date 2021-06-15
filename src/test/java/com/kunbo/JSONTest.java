package com.kunbo;

import com.kunbo.service.DianJiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JSONTest {
    @Autowired
    DianJiService dianJiService;
    @Test
    public void test1(){
        String r = "{productKey:a1Iv3jXIoqK}";
        dianJiService.insert(r);
    }
}
