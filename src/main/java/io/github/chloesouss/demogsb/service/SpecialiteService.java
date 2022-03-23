package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.projection.SpecialiteCollectionView;
import io.github.chloesouss.demogsb.repository.SpecialiteComplementaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialiteService {
    final SpecialiteComplementaireRepository specialiteComplementaireRepository;

    @Autowired
    public SpecialiteService(SpecialiteComplementaireRepository specialiteComplementaireRepository) {
        this.specialiteComplementaireRepository = specialiteComplementaireRepository;
    }

    public List<SpecialiteCollectionView> findAll() {
        return specialiteComplementaireRepository.findAllSpecialiteComplementaireBy();
    }

    public Optional<SpecialiteCollectionView> findById(Long Id) {
        return specialiteComplementaireRepository.findSpecialiteComplementaireById(Id);
    }
}
