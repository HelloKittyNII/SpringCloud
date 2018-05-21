package com.wzj.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wzj on 2018/5/19.
 */
@RestController
public class ConsumerController
{
    /**
     * 注入
     */
    @Autowired
    private ConsumerService consumerService;


    @RequestMapping("/consumer")
    public String client()
    {
        return consumerService.client();
    }
}
