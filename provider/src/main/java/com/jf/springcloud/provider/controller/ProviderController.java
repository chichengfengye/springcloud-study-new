package com.jf.springcloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider/user")
public class ProviderController {
    @GetMapping("/{id}")
    public Object getUser(@PathVariable String id) {
        return "user-provider01：" + id;
    }
}
