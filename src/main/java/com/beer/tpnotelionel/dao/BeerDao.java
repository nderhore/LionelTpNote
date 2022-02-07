package com.beer.tpnotelionel.dao;

import com.beer.tpnotelionel.entity.Beer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BeerDao {

    private static List<Beer> beers = new ArrayList<>();

    public Beer getBeerById(Long id){
        Beer beer = null;
        Optional<Beer> lesBieres = beers.stream().filter(biere -> biere.getId().equals(id)).findFirst();
        if(lesBieres.isPresent()){
            beer = lesBieres.get();
        }
        return beer;
    }

    public void deleteBeerById(Long id){
        beers.removeIf(beer -> beer.getId().equals(id));
    }

    public void createBeer(Beer beer){
        beer.setId((long) (beers.size() + 1));
        beers.add(beer);
    }

    public void updateBeerById(Long id, Beer beer){
        Beer biere = this.getBeerById(id);
        if(biere != null){
            biere.setBrasserie(beer.getBrasserie());
            biere.setNom(beer.getNom());
            biere.setType(beer.getType());
            this.deleteBeerById(id);
            beers.add(biere);
        }
    }

    public List<Beer> getAllBiere(){
        return beers;
    }
}
