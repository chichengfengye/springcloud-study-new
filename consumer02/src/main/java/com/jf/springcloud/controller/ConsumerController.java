package com.jf.springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/user")
public class ConsumerController {

    @GetMapping("/{id}")
    public Object getUser(@PathVariable String id) {
        return "consumer get result:\n ";//"jinfeng-" + id;
    }
}
