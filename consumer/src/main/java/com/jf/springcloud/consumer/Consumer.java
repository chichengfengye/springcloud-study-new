package com.jf.springcloud.consumer;

//import com.jf.springcloud.consumer.ribbon.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
//@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Consumer.class);
    }

}
