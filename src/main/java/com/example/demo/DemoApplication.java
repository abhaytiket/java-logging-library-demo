package com.example.demo;

import com.tiket.tix.lib.logger.TixLogger;
import com.tiket.tix.lib.logger.TixLoggerImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(TixLogger logger) {
        return args -> {
            Map<String, Object> sdc = new HashMap<>();
            sdc.put("key", "value");

            logger.info("This is an info message", sdc, null);
            logger.debug("This is a debug message", sdc, "12345");
            logger.warn("This is a warn message", sdc, "12345");
            logger.error("This is an error message", "Error details", sdc, "12345");
        };
    }

    @Bean
    public TixLogger tixLogger() {
        return new TixLoggerImpl();
    }
}
