package com.example.esercizio3.service;

import com.example.esercizio3.dto.PersonDto;
import com.example.esercizio3.model.Profession;
import com.example.esercizio3.repository.PersonRepository;
import com.example.esercizio3.model.Person;
import com.example.esercizio3.repository.ProfessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final ProfessionRepository professionRepository;

    public PersonService(PersonRepository personRepository, ProfessionRepository professionRepository) {
        this.personRepository = personRepository;
        this.professionRepository = professionRepository;
    }

    public void addPerson(PersonDto personDto){
        Person person = new Person(personDto.getName(),personDto.getSurname());
        Profession profession = professionRepository.findByName(personDto.getProfession());
        person.addProfession(profession);
        personRepository.save(person);
    }
    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(UUID id){
        return personRepository.findById(id);
    }
    public void deletePerson(UUID id){
         personRepository.deleteById(id);
    }

}
