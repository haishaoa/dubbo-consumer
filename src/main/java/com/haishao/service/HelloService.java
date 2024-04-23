package com.haishao.service;

/**
 * @author haishao
 * @time 2024-04-20-19:00
 * <p>
 * 服务消费方：业务层接口需要和服务提供方接口名称保持一致，同时该接口中抽象方法也要保持一致。
 * 服务消费方，不需要去实现这个接口，消费方接口保持是依赖服务提供方来实现的。
 */
public interface HelloService {
    String sayHello(String name);

    String sayBye(String name);
}
