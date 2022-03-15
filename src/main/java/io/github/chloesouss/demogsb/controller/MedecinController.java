package io.github.chloesouss.demogsb.controller;
import org.springframework.ui.Model;
import io.github.chloesouss.demogsb.entity.Medecin;
import io.github.chloesouss.demogsb.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/medecins")

public class MedecinController {
    final MedecinService medecinService;

    @Autowired
    public MedecinController(MedecinService medecinService) {
        this.medecinService = medecinService;
    }

    @GetMapping(path = "")
    public List<Medecin> getAll(@RequestParam(required = false, name ="nom", defaultValue = "")String nom){
        return this.medecinService.findAllByNom(nom);
    }

    @GetMapping("/{id}")
    public Medecin getById(@PathVariable("id") Long id){
        Optional<Medecin> medecinOptional = this.medecinService.findById(id);
        if(medecinOptional.isPresent()){
            return medecinOptional.get();
        } else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
