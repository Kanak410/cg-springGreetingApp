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


    // UC 1 - CRUD operation to get greeting
    @GetMapping
    public Greeting greeting(@RequestParam(value =  "name", defaultValue =  "World") String name){
        return greetingService.createGreeting(name);
    }

    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting){
        return greetingService.createGreeting(greeting.getMessage());
    }

    @PutMapping("/{name}")
    public Greeting updateGreeting(@PathVariable String name, @RequestBody Greeting newGreeting){
        return new Greeting("Updated: "+newGreeting.getMessage()+" for "+name);

    }

    @DeleteMapping("/{name}")
    public String deleteGreeting(@PathVariable String name){
        return "Greeting for "+name+" has been deleted";
    }



    // UC2 - return simple greeting (Hello world)
    @GetMapping("/simple")
    public Greeting getSimpleGreeting(){
        return greetingService.getSimpleGreeting();
    }

}
