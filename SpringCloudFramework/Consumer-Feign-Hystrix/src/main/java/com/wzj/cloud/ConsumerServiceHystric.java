package com.wzj.cloud;

import org.springframework.stereotype.Component;

/**
 * Created by wzj on 2018/5/21.
 */
@Component
public class ConsumerServiceHystric implements ConsumerService
{
    @Override
    public String client()
    {
        return "Consumer feign [client] error";
    }
}
