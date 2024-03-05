package com.example.esercizio4.service;

import com.example.esercizio4.dto.PersonDto;
import com.example.esercizio4.model.Profession;
import com.example.esercizio4.repository.PersonRepository;
import com.example.esercizio4.model.Person;
import com.example.esercizio4.repository.ProfessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    private final ProfessionRepository professionRepository;

    public PersonServiceImpl(PersonRepository personRepository, ProfessionRepository professionRepository) {
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
