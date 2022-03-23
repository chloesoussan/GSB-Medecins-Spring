package io.github.chloesouss.demogsb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class SpecialiteComplementaire {
    @Id
    private Long id;
    private String libelle;
    @OneToMany(mappedBy = "specialiteComplementaire")
    private Set<Medecin> medecins;

    public SpecialiteComplementaire() {
    }

    public SpecialiteComplementaire(Long id, String libelle, Set<Medecin> medecins) {
        this.id = id;
        this.libelle = libelle;
        this.medecins = medecins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Set<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(Set<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public String toString() {
        return "SpecialiteComplementaire{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", medecins=" + medecins +
                '}';
    }
}
