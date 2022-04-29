package com.example.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {
	private void metodka(){
		long zmienna = 100000L;
        	int zmienna2 = 10 + (int) zmienna;
		int [] a = {1, 2, 3, 4};
		int sum = 0;
		for (int i = 0; i <= a.length; i++) { // BAD
		    sum += a[i];
		}
		System.out.println("metodka");
	}
	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
