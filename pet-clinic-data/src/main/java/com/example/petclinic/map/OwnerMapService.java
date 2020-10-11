package com.example.petclinic.map;

import com.example.petclinic.model.Owner;
import com.example.petclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object, object.getId());
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
}
