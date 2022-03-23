package io.github.chloesouss.demogsb.projection;

import java.util.Set;

public interface DepartementCollectionView {
    Long getId();

    String getNom();

    String getNum();

    PaysView getPays();

    Set<MedecinView> getMedecins();
}
