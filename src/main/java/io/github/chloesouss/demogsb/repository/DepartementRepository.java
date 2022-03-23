package io.github.chloesouss.demogsb.repository;

import io.github.chloesouss.demogsb.entity.Departement;
import io.github.chloesouss.demogsb.projection.DepartementCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
    List<DepartementCollectionView> findAllDepartementBy();

    Optional<DepartementCollectionView> findDepartementById(Long id);
}
