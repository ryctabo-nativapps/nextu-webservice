package com.nextu.webservice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gustavo Pacheco <ryctabo@gmail.com>
 * @version 1.0
 */
@Path("myresource")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "This is a test!";
    }

}
