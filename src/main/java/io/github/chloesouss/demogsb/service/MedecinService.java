package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.entity.Medecin;
import io.github.chloesouss.demogsb.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedecinService {

    final MedecinRepository medecinRepository;

    @Autowired
    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public List<Medecin> findAll() {
        return medecinRepository.findAll();
    }

    public Optional<Medecin> findById(Long id) {
        return medecinRepository.findById(id);
    }

    public List<Medecin> findAllByNom (String nom) {
        return medecinRepository.findAllByNomContaining(nom);}

}
