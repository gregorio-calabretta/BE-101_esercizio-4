package com.example.esercizio4.service;


import com.example.esercizio4.model.Profession;

import java.util.List;

public interface ProfessionService {

     void addProfession(Profession profession);
     Profession findByNameAndSurname(String name, String surname);
     Profession getProfessionById(Integer id);
     List<Profession> getAllProfessions();

}
