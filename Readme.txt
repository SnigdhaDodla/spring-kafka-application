Building the Spring-Kafka-Application:

Developed a spring boot application to manually configure Kafka Producer and Kafka consumer.

Implemented a Maven Spring boot project with the following dependencies:

spring-kafka
spring-boot-starter-web

Implemented the Rest-Controller layer with autowired Sender class.

Implemented the Service layer with actual functionality behind the Kafka Producer and Kafka consumer with Sender and
Receiver classes.

Sender.Java:
In the Sender class(Producer), autowired KafkaTemplate which is configured in the Senderconfig class and is instantiated
using ProducerFactory. Using the KafkaTemplate "send" method, Data is produced onto the Kafka server.

Receiver.java:
In the receiver class, Using KafaListener annotation, ConcurrentMessageListenerContainer is created behind the scenes for
the given topic using ConsumerFactory.

Senderconfig.java:
Developed Senderconfig which handles the creation of KafkaTemplate and Sender and is annotated with @configuartion.
Configured ProducerFactory with customized properties. KafkaTemplate is built from ProducerFactory.

Receiverconfig.Java:
Implemented Receiverconfig which handles the creation and configuration of different spring beans required for the Receiver
class annotated with @Enablekafka to enable the detection of the @Kafkalistener annotation and @Configuartion.
ConcurrentKafkaListenerContainerfactory is built using custom configured ConsumerFactory.

Application.properties:
Kafka properties "kafka bootstrap sever port"," kafka topic" and "group-id" are configured in this file. These values
are accessed with @Value annotation.

Steps followed to Deploy the project:

1. Started the zookeeper with the following command in the command prompt:
C:\Users\Snigdha's\Documents\Kafka\kafka_2.12-1.1.1> cd .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. Start the kafka server with the following commandin the command prompt.
C:\Users\Snigdha's\Documents\Kafka\kafka_2.12-1.1.1>.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Run SpringKafkaApplication.java

4. Copy and Paste the link on the browser:
http://localhost:8080/Snigdha/Kafka/producer?data= Apache kafka with Spring Boot

o/p: INFO 14692 --- [nio-8080-exec-4] c.S.K.s.Service.Sender                   :  Apache kafka with Spring Boot
     Data: Apache kafka with Spring Boot
     kafkaTopic:test-topic


     INFO 14692 --- [ntainer#0-0-C-1] c.S.K.s.Service.Receiver                 : Message received=' Apache kafka with Spring Boot'
     Data Received Apache: kafka with Spring Boot



