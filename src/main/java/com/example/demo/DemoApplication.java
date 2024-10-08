package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        logger.atInfo().addKeyValue("x_request_id", "123456").log("Booking id {} confirmed for transaction {}", "1234", "5678");
    }
}
