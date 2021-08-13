package provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider/user")
public class Provider02Controller {
    @GetMapping("/{id}")
    public Object getUser(@PathVariable String id) {
        return Provider02Controller.class.getName() + "：" + id;
    }
}
