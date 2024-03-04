package com.example.esercizio3.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDto {
    private String name;
    private String surname;
    private String profession;

    public PersonDto(@JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("profession") String profession) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getProfession() {
        return profession;
    }
}
