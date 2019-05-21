package com.bojie.springboot01helloworldqucik;

import com.bojie.springboot01helloworldqucik.bean.Person;
import com.bojie.springboot01helloworldqucik.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.applet.AppletContext;

/**
 * springbott单元测试；
 *可以测试期间很方便的类似编码一暗影进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQucikApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
      boolean b = ioc.containsBean("helloService");
      System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
