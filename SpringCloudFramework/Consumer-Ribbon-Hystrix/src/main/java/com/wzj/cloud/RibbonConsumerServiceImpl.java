package com.wzj.cloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wzj on 2018/5/20.
 */
@Service
public class RibbonConsumerServiceImpl implements RibbonConsumerService
{
    /**
     * 注入
     */
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public String client()
    {
        return restTemplate.getForObject("http://service-producer/client", String.class);
    }

    public String fallback()
    {
        return "fallback";
    }
}
