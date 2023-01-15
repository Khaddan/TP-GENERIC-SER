package ma.devoir.entiter;

import java.io.Serializable;

public class Produit implements Serializable {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nStock;



    public Produit(long id, String nom, String marque, double prix, String description,int nStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nStock=nStock;
    }

    public Produit() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getnStock() {
        return nStock;
    }

    public void setnStock(int nStock) {
        this.nStock = nStock;
    }
}
