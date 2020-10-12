package com.example.petclinic.map;

import com.example.petclinic.model.Vet;
import com.example.petclinic.services.VetService;

import java.util.Set;

public class VetMapService  extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object, object.getId());
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
