package io.github.chloesouss.demogsb.projection;

public interface DepartementView {
    Long getId();

    String getNom();

    String getNum();

    PaysView getPays();
}
