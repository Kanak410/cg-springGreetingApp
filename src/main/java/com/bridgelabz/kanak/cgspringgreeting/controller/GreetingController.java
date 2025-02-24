package com.bridgelabz.kanak.cgspringgreeting.controller;

import com.bridgelabz.kanak.cgspringgreeting.dto.Greeting;
import com.bridgelabz.kanak.cgspringgreeting.services.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    @GetMapping
    public Greeting greeting(
            @RequestParam(value = "firstName", required = false) String firstName,
            @RequestParam(value = "lastName", required = false) String lastName){
        return greetingService.createGreeting(firstName,lastName);
    }

    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting){
        return greetingService.createGreeting(greeting.getFirstName(),greeting.getLastName());
    }



}
