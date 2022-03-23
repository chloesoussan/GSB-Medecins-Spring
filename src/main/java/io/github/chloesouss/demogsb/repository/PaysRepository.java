package io.github.chloesouss.demogsb.repository;

import io.github.chloesouss.demogsb.entity.Pays;
import io.github.chloesouss.demogsb.projection.PaysCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {
    List<PaysCollectionView> findAllPaysBy();

    Optional<PaysCollectionView> findPaysById(Long id);
}
