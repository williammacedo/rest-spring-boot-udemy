package br.com.example.restspringbootudemy.controller;

import br.com.example.restspringbootudemy.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting/{name}")
    public Greeting getGreeting(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
