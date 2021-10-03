package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class HelloController {

    @GetMapping("/fluxhello")
    public Flux<String> fluxhello() {
        return Flux.just("flux", "hello");
    }

}
