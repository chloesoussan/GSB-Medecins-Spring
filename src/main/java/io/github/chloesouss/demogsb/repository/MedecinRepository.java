package io.github.chloesouss.demogsb.repository;

import io.github.chloesouss.demogsb.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    List<Medecin> findAllByNomContaining(String nom);
}
