package com.beer.tpnotelionel.entity;

import com.beer.tpnotelionel.pojo.BeerType;

public class Beer {

    // ID unique d'une bière
    private Long id;

    //Nom de la bière
    private String nom;

    //Brasserie d'origine
    private String brasserie;

    //Type de bière
    private BeerType type;

    private Beer(){

    }

    private Beer(Long id,String nom,String brasserie, BeerType beerType){
        this.id = id;
        this.nom = nom;
        this.brasserie = brasserie;
        this.type = beerType;
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

    public String getBrasserie() {
        return brasserie;
    }

    public void setBrasserie(String brasserie) {
        this.brasserie = brasserie;
    }

    public BeerType getType() {
        return type;
    }

    public void setType(BeerType type) {
        this.type = type;
    }
}
