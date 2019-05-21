package com.bojie.springboot01helloworldqucik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot01HelloworldQucikApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HelloworldQucikApplication.class, args);
    }

}
