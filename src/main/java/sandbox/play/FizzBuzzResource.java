package sandbox.play;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/api/fizzbuzz/{number}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FizzBuzzResource {

    private FizzBuzz fizzbuzz;

    public FizzBuzzResource() {
        this.fizzbuzz = new FizzBuzz();
    }

    public FizzBuzzResource(String fizzword, String buzzword) {
        this.fizzbuzz = new FizzBuzz(fizzword, buzzword);
    }

    @GET
    public FizzBuzz getFizzBuzz(@PathParam("number") Integer number) {
        return this.fizzbuzz.translate(number);
    }

}
