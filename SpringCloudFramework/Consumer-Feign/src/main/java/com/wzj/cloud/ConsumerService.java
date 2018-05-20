package com.wzj.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wzj on 2018/5/20.
 */
@FeignClient("service-producer")
public interface ConsumerService
{
    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String client();
}
