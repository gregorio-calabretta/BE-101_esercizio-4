package com.example.esercizio4.controller;

import com.example.esercizio4.model.Profession;
import com.example.esercizio4.service.ProfessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/professions")
public class ProfessionController {

    private final ProfessionService professionService;

    public ProfessionController(ProfessionService professionService) {
        this.professionService = professionService;
    }

    @PostMapping
    public void addProfession(@RequestBody Profession profession){
        professionService.addProfession(profession);
    }

     @GetMapping
    public Profession findProfessionByPersonNameSurname(@RequestParam String name,@RequestParam String surname){
        return professionService.findByNameAndSurname(name,surname);
    }

    @GetMapping(path = "{professionId}")
    public Profession getProfessionById(@PathVariable("professionId") Integer id){
        return professionService.getProfessionById(id);
    }
    @GetMapping(path = "/")
    public List<Profession> getAllProfessions(){
        return professionService.getAllProfessions();
    }

}
