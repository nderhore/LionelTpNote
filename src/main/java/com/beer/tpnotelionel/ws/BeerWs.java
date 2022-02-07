package com.beer.tpnotelionel.ws;

import com.beer.tpnotelionel.entity.Beer;
import com.beer.tpnotelionel.service.BeerService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Model
@Path("/beer")
@ApplicationScoped
public class BeerWs {

    @Inject
    private BeerService beerService;

    @GET
    @Path("/{id}")
    public Beer getBeerById(@PathParam("id") Long id){
        return beerService.getBeerById(id);
    }

    @GET
    public List<Beer> getAllBeer(){
        return beerService.getAllBeer();
    }

    @PUT
    public void createBeer(Beer beer){
        beerService.createBeer(beer);
    }

    @POST
    @Path("/{id}")
    public void updateBeerById(@PathParam("id") Long id, Beer beer){
        beerService.updateBeerById(id,beer);
    }

    @DELETE
    @Path("/{id}")
    public void deleteBeerById(@PathParam("id") Long id){
        beerService.deleteBeerById(id);
    }
}
