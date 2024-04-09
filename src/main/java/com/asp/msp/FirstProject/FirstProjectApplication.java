package com.asp.msp.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(FirstProjectApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Error: "+e.getMessage());
		}

	}

}
