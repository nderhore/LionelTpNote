package com.beer.tpnotelionel.service;

import com.beer.tpnotelionel.dao.BeerDao;
import com.beer.tpnotelionel.entity.Beer;

import javax.inject.Inject;
import java.util.List;

public class BeerService {

    @Inject
    private BeerDao beerDao;

    public Beer getBeerById(Long id){
        return beerDao.getBeerById(id);
    }

    public void deleteBeerById(Long id){
        beerDao.deleteBeerById(id);
    }

    public void updateBeerById(Long id, Beer beer){
        beerDao.updateBeerById(id,beer);
    }

    public void createBeer(Beer beer){
        beerDao.createBeer(beer);
    }

    public List<Beer> getAllBeer(){
        return beerDao.getAllBiere();
    }
}
