package io.github.chloesouss.demogsb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Medecin {
    @Id
    private Long id;
    private String prenom;
    private String nom;
    private String adresse;
    private String tel;
    @ManyToOne(optional = true)
    private SpecialiteComplementaire specialiteComplementaire;
    @ManyToOne
    private Departement departement;

    public Medecin(Long id, String prenom, String nom, String adresse, String tel, SpecialiteComplementaire specialiteComplementaire, Departement departement) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
        this.specialiteComplementaire = specialiteComplementaire;
        this.departement = departement;
    }

    public Medecin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public SpecialiteComplementaire getSpecialiteComplementaire() {
        return specialiteComplementaire;
    }

    public void setSpecialiteComplementaire(SpecialiteComplementaire specialiteComplementaire) {
        this.specialiteComplementaire = specialiteComplementaire;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", specialiteComplementaire='" + specialiteComplementaire + '\'' +
                ", departement=" + departement +
                '}';
    }
}
