package io.github.chloesouss.demogsb.projection;

import java.util.Set;

public interface SpecialiteCollectionView {
    Long getId();

    String getLibelle();

    Set<MedecinView> getMedecins();
}
