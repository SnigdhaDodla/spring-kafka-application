package com.Snigdha.KafkaSpringbootApplication.springkafkaapplication.Controller;

import com.Snigdha.KafkaSpringbootApplication.springkafkaapplication.Service.Receiver;
import com.Snigdha.KafkaSpringbootApplication.springkafkaapplication.Service.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Snigdha/Kafka")
public class Kafkacontroller
{
   @Autowired
    Sender producer;
    @GetMapping(value="/producer")
    public String producer(@RequestParam("data")String data){
        producer.send(data);

        return "Success";
    }



}
