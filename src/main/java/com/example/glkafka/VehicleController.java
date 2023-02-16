package com.example.glkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController
{
    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping()
    public ResponseEntity<String> sendMessage(@RequestBody Vehicle vehicle)
    {
        kafkaProducer.send(vehicle);
        return ResponseEntity.ok("Response: ok");
    }

}
