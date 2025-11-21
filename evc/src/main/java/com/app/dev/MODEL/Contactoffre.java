package com.app.dev.MODEL;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "medcontactoffre")
public class Contactoffre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idcontactoffre;
    private String nome;
    private String prenom;
    private String specialite;
    private String pays;

    private String email;

    private String pack;

    public Contactoffre(int idcontactoffre, String nome, String prenom, String specialite, String pays,
                    String email , String pack) {

        this.idcontactoffre = idcontactoffre;
        this.nome = nome;
        this.prenom = prenom;
        this.specialite = specialite;
        this.pays = pays;
        this.email = email;
        this.pack = pack;
    }
    public Contactoffre() {

    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public int getIdcontactoffre() {
        return idcontactoffre;
    }

    public void setIdcontactoffre(int idcontactoffre) {
        this.idcontactoffre = idcontactoffre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contactoffre [idcontactoffre=" + idcontactoffre + ", nome=" + nome + ", prenom=" + prenom + ", specialite="
                + specialite + ", pays=" + pays + " , email=" + email +" , pack=" + pack +  "]";
    }
}
