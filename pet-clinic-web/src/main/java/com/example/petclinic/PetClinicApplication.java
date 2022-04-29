package com.example.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {
	private void metodka(){
		long zmienna = 100000L;
        	int zmienna2 = 10 + (int) zmienna;
		System.out.println("metodka");
	}
	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
