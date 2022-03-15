package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.entity.Departement;
import io.github.chloesouss.demogsb.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {

    final DepartementRepository departementRepository;

    @Autowired
    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    public List<Departement> findAll(){
        return departementRepository.findAll();
    }
    public Optional<Departement> findById(Long id){
        return departementRepository.findById(id);
    }
}
