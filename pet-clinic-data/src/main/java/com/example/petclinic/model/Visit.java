package com.example.petclinic.model;

import java.time.LocalDate;

public class Visit {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPetId() {
        return pet;
    }

    public void setPet(Long petId) {
        this.pet = pet;
    }
}
