package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        // Create a fixed thread pool with 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Define different logging tasks
        Runnable loggingTask1 = () -> {
            logger.atInfo().addKeyValue("x_request_id", "123456").addKeyValue("booking_id", 1234)
                  .log("Booking id {} confirmed for transaction {}", "1234", "5678");
        };

        Runnable loggingTask2 = () -> {
            logger.atInfo().addKeyValue("x_request_id", "654321").addKeyValue("booking_id", 4321)
                  .log("Booking id {} confirmed for transaction {}", "4321", "8765");
        };

        Runnable loggingTask3 = () -> {
            logger.atInfo().addKeyValue("x_request_id", "789012").addKeyValue("booking_id", 5678)
                  .log("Booking id {} confirmed for transaction {}", "5678", "1234");
        };

        // Submit logging tasks for parallel execution
        executorService.submit(loggingTask1);
        executorService.submit(loggingTask2);
        executorService.submit(loggingTask3);

        // Shutdown the executor service
        executorService.shutdown();
    }
}
