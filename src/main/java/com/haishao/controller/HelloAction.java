package com.haishao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haishao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haishao
 * @time 2024-04-20-19:04
 */
@RestController
public class HelloAction {
    /**
     * 将Zookeeper注册中心中dubbo-server的服务提供注册的具体实现
     * <p>
     * 1、该注解的@Reference功能和@Autowired完全相同，但是对象的来源不同
     * 2、@Autowired本应用程序中获取指定类型的对象，@Reference注解在分布式环境下的注册中心去找指定的类型的对象。
     *
     * @Reference
     */
    @Autowired
    private HelloService helloService;


    @RequestMapping("/hello")
    public String hello(String name) {
        //前端传递Tom，返回："Hello,Tom"。
        return helloService.sayHello(name);
    }
}
