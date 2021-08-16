package com.jf.springcloud.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {
    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;
    @Value("${services.service_name}")
    private String serviceName;

    @GetMapping("/{id}")
    public Object getUser(@PathVariable String id) {
        String uri = "http://" + serviceName + "/provider/user/" + id;
        logger.info("=======> {}", uri);
        String result = restTemplate.getForObject(uri, String.class);
//        String result = restTemplate.getForObject("http://localhost:8801/provider/user/" + id, String.class);
        return "consumer get result:\n " + result;//"jinfeng-" + id;
    }
}
