package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.projection.PaysCollectionView;
import io.github.chloesouss.demogsb.repository.PaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaysService {
    final PaysRepository paysRepository;

    @Autowired
    public PaysService(PaysRepository paysRepository) {
        this.paysRepository = paysRepository;
    }

    public List<PaysCollectionView> findAll() {
        return paysRepository.findAllPaysBy();
    }

    public Optional<PaysCollectionView> findById(Long id) {
        return paysRepository.findPaysById(id);
    }
}
