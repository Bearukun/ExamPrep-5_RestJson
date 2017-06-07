package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import utility.DataGenerator;

/**
 * REST Web Service
 *
 */
@Path("addresses")
public class AddressesResource {
    
    DataGenerator dG;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AddressesResource
     */
    public AddressesResource() {
        
        dG = new DataGenerator();
        
    }

    /**
     * Retrieves representation of an instance of rest.AddressesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{amount}/{properties}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("amount") int amount ,@PathParam("properties") String properties) {
       
        return dG.getData(amount, properties);
        
    }

    /**
     * PUT method for updating or creating an instance of AddressesResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
