package io.github.chloesouss.demogsb.service;

import io.github.chloesouss.demogsb.entity.Medecin;
import io.github.chloesouss.demogsb.projection.MedecinCollectionView;
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

    public List<MedecinCollectionView> findAll() {
        return medecinRepository.findAllMedecinBy();
    }

    public Optional<MedecinCollectionView> findById(Long id) {
        return medecinRepository.findMedecinById(id);
    }

    public List<MedecinCollectionView> findAllByNom(String nom) {
        return medecinRepository.findAllByNomContaining(nom);
    }

    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

}
