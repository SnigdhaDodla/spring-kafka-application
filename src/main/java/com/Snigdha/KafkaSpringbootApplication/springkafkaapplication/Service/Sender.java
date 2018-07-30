package com.Snigdha.KafkaSpringbootApplication.springkafkaapplication.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {

    public static final Logger log  = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String,String> kf;
    @Value("${kafka.topic}")
    String kafka_topic;


public  void send(String data)
{
    log.info(data);
    System.out.println("Data:"+data);
    System.out.println("kafkaTopic:"+kafka_topic);
    kf.send(kafka_topic,data);
}


}
