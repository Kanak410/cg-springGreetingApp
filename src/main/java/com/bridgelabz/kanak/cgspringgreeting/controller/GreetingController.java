package com.bridgelabz.kanak.cgspringgreeting.controller;

import com.bridgelabz.kanak.cgspringgreeting.dto.Greeting;
import com.bridgelabz.kanak.cgspringgreeting.repository.GreetingRepository;
import com.bridgelabz.kanak.cgspringgreeting.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//
//    @GetMapping
//    public Greeting greeting(
//            @RequestParam(value = "firstName", required = false) String firstName,
//            @RequestParam(value = "lastName", required = false) String lastName){
//        return greetingService.createGreeting(firstName,lastName);
//    }
//
//    @PostMapping
//    public Greeting createGreeting(@RequestBody Greeting greeting){
//        return greetingService.createGreeting(greeting.getFirstName(),greeting.getLastName());
//    }
    @Autowired
    private GreetingRepository greetingRepository;

    @PostMapping()
    public Greeting saveGreeting(@RequestBody Greeting greeting){
        return greetingRepository.save(greeting);
    }
    @GetMapping("/{id}")
    public Greeting getGreeting(@PathVariable long id){
        return greetingRepository.findById(id).orElse(null);
    }



}
