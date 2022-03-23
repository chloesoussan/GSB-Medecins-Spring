package io.github.chloesouss.demogsb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table

public class Pays {
    @Id
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "pays")
    private Set<Departement> departements;

    public Pays(Long id, String nom, Set<Departement> departements) {
        this.id = id;
        this.nom = nom;
        this.departements = departements;
    }

    public Pays() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(Set<Departement> departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", departements=" + departements +
                '}';
    }
}
