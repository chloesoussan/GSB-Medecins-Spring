package io.github.chloesouss.demogsb.controller;

import io.github.chloesouss.demogsb.projection.MedecinCollectionView;
import io.github.chloesouss.demogsb.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public List<MedecinCollectionView> getAll(@RequestParam(required = false, name = "nom", defaultValue = "") String nom) {
        return this.medecinService.findAllByNom(nom);
    }

    @GetMapping("/{id}")
    public MedecinCollectionView getById(@PathVariable("id") Long id) {
        Optional<MedecinCollectionView> medecinOptional = this.medecinService.findById(id);
        if (medecinOptional.isPresent()) {
            return medecinOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
