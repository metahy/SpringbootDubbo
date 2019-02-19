package com.hiram.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hiram.dubbo.api.service.DemoService;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", I'm provider!";
    }
}
