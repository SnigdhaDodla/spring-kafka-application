package com.Snigdha.KafkaSpringbootApplication.springkafkaapplication.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Receiver
{

    private static final Logger logg = LoggerFactory.getLogger(Receiver.class);

    @KafkaListener(topics = "${kafka.topic}")
    public void  getMessage(String datacontent)
    {
        logg.info("Message received='{}'",datacontent);
        System.out.println("Data Received:"+datacontent);

    }



}
