package com.Develope.exercise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Scrivi una applicazione web Spring Boot che alla endpoint
//		GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con
//		"Ciao Giuseppe, com'è il tempo in Lombardia?"
@SpringBootApplication
public class Exercise1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise1Application.class, args);
	}

}
