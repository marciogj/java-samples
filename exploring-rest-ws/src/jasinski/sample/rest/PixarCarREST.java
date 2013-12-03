package jasinski.sample.rest;

import jasinski.sample.model.PixarCar;
import jasinski.sample.service.CarsMockService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("car")
@Produces("application/json")
public class PixarCarREST {
	
	@GET
    @Path("ping")	
    public String ping() {
        return new Date().toString() + " - PixarCarREST service is up and running!";
    }
   
    @GET
    @Path("info/{carId}")
    public PixarCar getCarInfo(@PathParam("carId") final String carId) {
        return CarsMockService.getCar(carId);
    }


    @GET
    @Path("all")
    public Collection<PixarCar> getAll() {
        return CarsMockService.getAll();
    }
    
    
    @POST
    @Path("add")
    @Consumes("application/json")
    public void addNewCar(final PixarCar aCar) {
    	System.out.println("Adding new car..." + aCar);
    	CarsMockService.addPixarCar(aCar);
    }
    
    @POST
    @Path("addAll")
    @Consumes("application/json")
    public void addAll(final ArrayList<PixarCar> carList) {
    	for (PixarCar pixarCar : carList) {
    		CarsMockService.addPixarCar(pixarCar);
		}
    }
}
