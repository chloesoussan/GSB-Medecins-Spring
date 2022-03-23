package io.github.chloesouss.demogsb.repository;

import io.github.chloesouss.demogsb.entity.Medecin;
import io.github.chloesouss.demogsb.projection.MedecinCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    List<MedecinCollectionView> findAllMedecinBy();

    List<MedecinCollectionView> findAllByNomContaining(String nom);

    Optional<MedecinCollectionView> findMedecinById(Long id);
}
