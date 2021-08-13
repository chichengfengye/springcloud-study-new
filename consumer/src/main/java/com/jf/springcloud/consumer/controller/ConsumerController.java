package com.jf.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Object getUser(@PathVariable String id) {
        String result = restTemplate.getForObject("http://localhost:8801/provider/user/" + id, String.class);
        return "consumer get result:\n "+result;//"jinfeng-" + id;
    }
}
