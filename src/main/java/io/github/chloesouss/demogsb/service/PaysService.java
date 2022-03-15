package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.entity.Pays;
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
    public List<Pays>  findAll()
    {
        return paysRepository.findAll();
    }
    public Optional<Pays> findById(Long id)
    {
        return paysRepository.findById(id);
    }
}
