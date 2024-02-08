package com.github.bender316.spring.boot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        throw new BadRequestException();

       // throw new IllegalStateException();
    }
}
