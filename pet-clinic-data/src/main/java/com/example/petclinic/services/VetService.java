package com.example.petclinic.services;

import com.example.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet owner);

    Set<Vet> findAll();
}
