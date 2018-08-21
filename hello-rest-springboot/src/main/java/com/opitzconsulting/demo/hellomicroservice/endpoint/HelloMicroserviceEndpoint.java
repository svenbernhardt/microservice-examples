package com.opitzconsulting.demo.hellomicroservice.endpoint;

import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RestController
public class HelloMicroserviceEndpoint {

    @RequestMapping(value = "/api/hello/{name}", method = RequestMethod.GET)
    public Response sayHello(
		    @PathVariable(value = "name") String name) {
	String json = String.format("{ \"message\" : \"Hello, %s!\" }", name);
        return Response.ok(json, MediaType.APPLICATION_JSON_TYPE).build();
    }
}
