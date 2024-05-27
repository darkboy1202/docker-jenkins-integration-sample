package com.bn.docker_demo.docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/demo")
    public String runDemo() {
        return "Hello Bau Duc Nguyen";
    }
}
