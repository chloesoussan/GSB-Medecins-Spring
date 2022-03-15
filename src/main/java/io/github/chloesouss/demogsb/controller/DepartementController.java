package io.github.chloesouss.demogsb.controller;

import io.github.chloesouss.demogsb.entity.Departement;
import io.github.chloesouss.demogsb.entity.Medecin;
import io.github.chloesouss.demogsb.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/departements")
public class DepartementController {
    final DepartementService departementService;

    @Autowired
    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }
    @GetMapping
    public List<Departement> getAll(){
        return this.departementService.findAll();
    }

    @GetMapping("/{id}")
    public Departement getById(@PathVariable("id") Long id){
        Optional <Departement> departementOptional = this.departementService.findById(id);
        if(departementOptional.isPresent()){
            return departementOptional.get();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    }


