package com.example.esercizio3.model;

import jakarta.persistence.*;

import java.util.UUID;

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


    public UUID getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public Profession getProfession() {
        return profession;
    }

    public void addProfession(Profession profession){
        this.profession = profession;
    }



}
