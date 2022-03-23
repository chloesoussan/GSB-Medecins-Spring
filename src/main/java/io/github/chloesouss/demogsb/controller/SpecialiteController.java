package io.github.chloesouss.demogsb.controller;

import io.github.chloesouss.demogsb.projection.SpecialiteCollectionView;
import io.github.chloesouss.demogsb.service.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/specialites")
public class SpecialiteController {
    final SpecialiteService specialiteService;

    @Autowired
    public SpecialiteController(SpecialiteService specialiteService) {
        this.specialiteService = specialiteService;
    }

    @GetMapping
    public List<SpecialiteCollectionView> getAll() {
        return this.specialiteService.findAll();
    }

    @GetMapping("/{id}")
    public SpecialiteCollectionView getById(@PathVariable("id") Long id) {
        Optional<SpecialiteCollectionView> specialitesOptional = this.specialiteService.findById(id);
        if (specialitesOptional.isPresent()) {
            return specialitesOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
