package com.app.dev.MODEL;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "medtemoignage")
public class Temoignage {
    public Temoignage(int idtemoignage , String name, String text) {

        this.idtemoignage = idtemoignage;
        this.name = name;
        this.text = text;

}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idtemoignage;

    private String name;
    private String text;




    public Temoignage() {

    }

    public int getIdtemoignage() {
        return idtemoignage;
    }

    public void setIdtemoignage(int idtemoignage) {
        this.idtemoignage = idtemoignage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Temoignage [idtemoignage=" + idtemoignage + ", name=" + name + ", text=" + text + "]";
    }

}
