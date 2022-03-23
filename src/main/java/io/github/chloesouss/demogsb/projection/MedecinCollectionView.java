package io.github.chloesouss.demogsb.projection;

public interface MedecinCollectionView {
    Long getId();

    String getNom();

    String getPrenom();

    String getAdresse();

    String getTel();

    SpecialiteView getSpecialiteComplementaire();

    DepartementView getDepartement();
}
