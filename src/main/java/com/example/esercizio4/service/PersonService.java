package com.example.esercizio4.service;

import com.example.esercizio4.dto.PersonDto;
import com.example.esercizio4.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonService {
    void addPerson(PersonDto personDto);
    List<Person> getAllPeople();

    Optional<Person> getPersonById(UUID id);
    void deletePerson(UUID id);
}
