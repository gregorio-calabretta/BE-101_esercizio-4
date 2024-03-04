package com.example.esercizio3.controller;

import com.example.esercizio3.dto.PersonDto;
import com.example.esercizio3.model.Person;
import com.example.esercizio3.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/persons")
@RestController
public class PersonController {


    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody PersonDto person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path = "{personUuid}")
    public Person getPersonById(@PathVariable("personUuid") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{personUuid}")
    public void deletePersonById(@PathVariable("personUuid") UUID id){
        personService.deletePerson(id);
    }



}
