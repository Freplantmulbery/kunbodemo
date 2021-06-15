package com.kunbo;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.iot.model.v20180120.PubRequest;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AMQPTest {
    @Test
    public void t1(){

        try{

        String accessKey = "LTAI5tLBaeWCdsu9ZWuhYdXh";
        String accessSecret = "FvXqDAcd9eeM6btQqmPwOAjS9scd62";
        IClientProfile profile = DefaultProfile.getProfile("cn-shanghai", accessKey, accessSecret);
        DefaultAcsClient client = new DefaultAcsClient(profile); //初始化SDK客户端。

        PubRequest request = new PubRequest();
//        request.setIotInstanceId("${iotInstanceId}");//公共实例用不到
        request.setProductKey("a1Iv3jXIoqK");
        request.setMessageContent(Base64.encodeBase64String("hello world".getBytes()));
        request.setTopicFullName("/a1Iv3jXIoqK/dianji/user/get");
        request.setQos(0); //目前支持QoS0和QoS1。

            PubResponse response = client.getAcsResponse(request);
            System.out.println(response.getSuccess());
            System.out.println(response.getErrorMessage());
        }catch (ClientException e){
            e.printStackTrace();
        }
    }
}
