package com.example.petclinic.bootstrap;

import com.example.petclinic.map.OwnerMapService;
import com.example.petclinic.map.VetMapService;
import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sansa");
        owner1.setLastName("Smith");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Monique");
        vet1.setLastName("Morrone");
    }
}
