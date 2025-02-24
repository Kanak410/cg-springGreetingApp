package com.bridgelabz.kanak.cgspringgreeting.dto;

//public class Greeting {
//    private final String message;
//    private final String firstName;
//    private final String lastName;
//
//    public Greeting(String message, String firstName, String lastName) {
//        this.message = message;
//        this.firstName = firstName;
//        this.lastName = lastName;
//
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//}

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    public Greeting(){}
    public Greeting(String message) {
        this.message = message;
}

public Greeting(String message, String firstName, String lastName) {

}

public long getId() {

    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}


}
