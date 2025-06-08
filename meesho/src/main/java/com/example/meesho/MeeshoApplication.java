package com.example.meesho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeeshoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MeeshoApplication.class, args);
			System.out.println("Application Started");
		}
		catch (Exception e) {
			System.out.println("Application Failed to Start" + e.getMessage());
		}
	}

}
