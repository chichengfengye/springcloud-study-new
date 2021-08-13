package com.jf.springcloud.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ConsumerController {
    @GetMapping("/{id}")
    public Object getUser(@PathVariable String id) {
        return "jinfeng-" + id;
    }
}
