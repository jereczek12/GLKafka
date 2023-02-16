package com.example.glkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class GlKafkaApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(GlKafkaApplication.class, args);
    }

    @KafkaListener(topics = "vehicles-topic", groupId = "vehicles")
    public void listen(Vehicle vehicle)
    {
        log.info("Received vehicle: {}", vehicle);
    }
}
