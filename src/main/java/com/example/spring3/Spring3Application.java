package com.example.spring3;

import com.example.spring3.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring3Application.class, args);
	}

	@Bean
	ApplicationListener<ApplicationReadyEvent> readyEventApplicationListener (CustomerRepository customerRepository){
		return event -> customerRepository.findAll().forEach(System.out::println);
	}

}
