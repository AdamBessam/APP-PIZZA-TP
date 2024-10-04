package com.ensa.menupizza.beans;

import java.io.Serializable;

public class Produit implements Serializable {
    private int id;
    private static int comp=0;
    private String nom,detailsIngred,description,preparation;
    private int nbrIngredients;
    private int photo;
    private float duree;

    public Produit(){

    }

    public Produit(String nom,int nbrIngredients,int photo,float duree,  String detailsIngred, String description, String preparation) {
        this.nom = nom;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.id=++comp;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public float getDuree() {
        return duree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                '}';
    }
}
