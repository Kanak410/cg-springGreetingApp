package com.bridgelabz.kanak.cgspringgreeting.repository;

import com.bridgelabz.kanak.cgspringgreeting.dto.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
