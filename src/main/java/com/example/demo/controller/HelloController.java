package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/monohello")
    public Mono<String> monohello() {
        return Mono.just("monohello");
    }

    @GetMapping("/fluxhello")
    public Flux<String> fluxhello() {
        return Flux.just("flux", "hello");
    }

}
