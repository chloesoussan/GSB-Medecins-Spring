package io.github.chloesouss.demogsb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table
public class Departement {
    @Id
    private Long id;
    private String nom;
    private String num;
    @ManyToOne
    private Pays pays;
    @OneToMany(mappedBy = "departement")
    private Set<Medecin> medecins;

    public Departement(Long id, String nom, String num, Pays pays, Set<Medecin> medecins) {
        this.id = id;
        this.nom = nom;
        this.num = num;
        this.pays = pays;
        this.medecins = medecins;
    }

    public Departement() {
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @JsonBackReference
    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @JsonManagedReference
    public Set<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(Set<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", num='" + num + '\'' +
                ", pays=" + pays +
                ", medecins=" + medecins +
                '}';
    }
}
