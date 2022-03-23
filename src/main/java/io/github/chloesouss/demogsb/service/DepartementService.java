package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.projection.DepartementCollectionView;
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

    public List<DepartementCollectionView> findAll() {
        return departementRepository.findAllDepartementBy();
    }

    public Optional<DepartementCollectionView> findById(Long id) {
        return departementRepository.findDepartementById(id);
    }
}
