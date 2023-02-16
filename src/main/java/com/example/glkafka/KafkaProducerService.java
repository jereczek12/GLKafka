package com.example.glkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducerService
{
    @Autowired
    private KafkaTemplate<String, Vehicle> kafkaTemplate;

    String kafkaTopic = "vehicles-topic";

    public void send(Vehicle vehicle) {
        log.info("Sent vehicle: {}", vehicle);
        kafkaTemplate.send(kafkaTopic, vehicle);
    }
}