package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Student s1= new Student();
		System.out.println(s1.getId());
		System.out.println(s1.getAdress());
		System.out.println(s1.getId());
		
	}

}
