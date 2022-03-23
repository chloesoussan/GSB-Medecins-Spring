package io.github.chloesouss.demogsb.projection;

import java.util.Set;

public interface PaysCollectionView {
    Long getId();

    String getNom();

    Set<DepartementCollectionView> getDepartements();
}
