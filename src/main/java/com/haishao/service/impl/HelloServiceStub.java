package com.haishao.service.impl;

import com.haishao.service.HelloService;
import org.springframework.util.StringUtils;

/**
 * @author haishao
 * @time 2024-04-22-18:43
 */
public class HelloServiceStub implements HelloService {
    private HelloService helloService;

    public HelloServiceStub(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHello(String name) {
        if (!StringUtils.isEmpty(name)) {
            return helloService.sayHello(name);
        }
        return "param is not null";
    }

    @Override
    public String sayBye(String name) {
        if (!StringUtils.isEmpty(name)) {
            return helloService.sayBye(name);
        }
        return "param is not null";
    }
}
