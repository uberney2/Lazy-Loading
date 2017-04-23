package co.com.lazy.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by UBERNEY on 23/04/2017.
 */

@Path("lazy")
public class LazyServices {
    @Path("greet")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String greet() {
        return "Hola Mundo";
    }

}
