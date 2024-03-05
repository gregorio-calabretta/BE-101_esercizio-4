package com.example.esercizio4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String surname;

    @ManyToOne
    private Profession profession;

    public Person(String name, String surname ) {
        this.name = name;
        this.surname = surname;
    }
    public Person() {
    }
    public void addProfession(Profession profession){
        this.profession = profession;
    }
}
