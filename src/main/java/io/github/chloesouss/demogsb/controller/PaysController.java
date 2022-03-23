package io.github.chloesouss.demogsb.controller;

import io.github.chloesouss.demogsb.projection.PaysCollectionView;
import io.github.chloesouss.demogsb.service.PaysService;
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
@RequestMapping("/api/v1/pays")
public class PaysController {
    final PaysService paysService;

    @Autowired
    public PaysController(PaysService paysService) {
        this.paysService = paysService;
    }

    @GetMapping
    public List<PaysCollectionView> getAll() {
        return this.paysService.findAll();
    }

    @GetMapping("/{id}")
    public PaysCollectionView getById(@PathVariable("id") Long id) {
        Optional<PaysCollectionView> paysOptional = this.paysService.findById(id);
        if (paysOptional.isPresent()) {
            return paysOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
