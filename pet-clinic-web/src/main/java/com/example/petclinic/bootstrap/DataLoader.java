package com.example.petclinic.bootstrap;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.PetTypeService;
import com.example.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Sansa");
        owner1.setLastName("Smith");
        owner1.setAddress("10 Breahead");
        owner1.setCity("Floride");
        owner1.setTelephone("123123123");

        PetType petType1 = new PetType();
        petType1.setName("dog");
        PetType savedPetType = petTypeService.save(petType1);

        Pet pet1 = new Pet();
        pet1.setPetType(savedPetType);
        pet1.setBirthday(LocalDate.now());
        pet1.setName("Chico");
        pet1.setOwner(owner1);

        owner1.getPets().add(pet1);
        ownerService.save(owner1);

        Vet vet1 = new Vet();
        vet1.setFirstName("Monique");
        vet1.setLastName("Morrone");
        vetService.save(vet1);
    }
}
