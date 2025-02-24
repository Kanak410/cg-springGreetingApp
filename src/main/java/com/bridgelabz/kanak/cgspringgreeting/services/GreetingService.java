package com.bridgelabz.kanak.cgspringgreeting.services;

import com.bridgelabz.kanak.cgspringgreeting.dto.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public Greeting createGreeting(String name){
        return new Greeting(String.format("Hello, %s!",name));
    }

    public Greeting getSimpleGreeting(){
        return new Greeting("Hello World");
    }
}
