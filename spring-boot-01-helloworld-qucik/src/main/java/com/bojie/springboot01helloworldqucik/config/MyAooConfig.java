package com.bojie.springboot01helloworldqucik.config;

import com.bojie.springboot01helloworldqucik.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAooConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("添加组件");
        return new HelloService();
    }
}
