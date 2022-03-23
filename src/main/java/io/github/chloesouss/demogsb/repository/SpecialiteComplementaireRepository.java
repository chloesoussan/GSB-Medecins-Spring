package io.github.chloesouss.demogsb.repository;

import io.github.chloesouss.demogsb.entity.SpecialiteComplementaire;
import io.github.chloesouss.demogsb.projection.SpecialiteCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpecialiteComplementaireRepository extends JpaRepository<SpecialiteComplementaire, Long> {
    List<SpecialiteCollectionView> findAllSpecialiteComplementaireBy();

    Optional<SpecialiteCollectionView> findSpecialiteComplementaireById(Long id);
}
