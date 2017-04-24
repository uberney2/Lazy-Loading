package co.com.lazy.rest.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by UBERNEY on 23/04/2017.
 */

@Path("lazy")
public class LazyServices {

    @Path("loading")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String loading(@QueryParam("items") String items, @QueryParam("day") int day) {
        int [] it = Stream.of(items.split(", ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(it);
        return "Case #" + day + ": " + travels(it);
    }

    private int travels(int[] w) {
        int count = 0, back = w.length - 1, front = 0;
        while(front < back) {
            int b = w[back]; back--;
            if(b < 50) front += (50 / b);
            count++;
        }
        return count;
    }

}
