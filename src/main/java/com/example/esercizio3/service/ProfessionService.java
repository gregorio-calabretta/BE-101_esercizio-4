package com.example.esercizio3.service;

import com.example.esercizio3.model.Person;
import com.example.esercizio3.model.Profession;
import com.example.esercizio3.repository.PersonRepository;
import com.example.esercizio3.repository.ProfessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionService {
    private final ProfessionRepository professionRepository;
    private final PersonRepository personRepository;
    public ProfessionService(ProfessionRepository professionRepository, PersonRepository personRepository) {
        this.professionRepository = professionRepository;
        this.personRepository = personRepository;
    }

    public void addProfession(Profession profession){
         professionRepository.save(profession);
    }



    public Profession findByNameAndSurname(String name, String surname) {
        Person person = personRepository.findByNameAndSurname(name,surname);
        return person.getProfession();
    }

    public Profession getProfessionById(Integer id) {
        return professionRepository.findById(id).orElse(null);
    }

    public List<Profession> getAllProfessions(){
        return professionRepository.findAll();
    }

}
