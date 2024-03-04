package com.example.esercizio4.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "profession")
public class Profession {
    @Id
    private Integer id;
    private String name;


    public Profession(@JsonProperty Integer id,@JsonProperty String name) {
        this.id = id;
        this.name = name;
    }
    public Profession() {
    }

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Person> person;



}
