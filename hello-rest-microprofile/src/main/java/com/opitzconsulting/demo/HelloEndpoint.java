package com.opitzconsulting.demo;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by svb on 21.08.18.
 */
@Path("/hello")
@RequestScoped
public class HelloEndpoint {

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello(@PathParam("name") String name) {

        return Response.ok(new HelloResource(name)).build();
    }
}
