package com.example.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {
	private void metodka(){
		Integer liczba = null;
        	int liczba2 = liczba.intValue();
		System.out.println("metodka");
	}
	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
