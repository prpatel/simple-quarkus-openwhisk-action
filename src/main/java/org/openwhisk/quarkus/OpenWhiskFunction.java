package org.openwhisk.quarkus;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
@Produces("application/json")
@Consumes("application/json")
public class OpenWhiskFunction {

    @POST
    @Path("/init")
    public Response init() {
        System.out.println("/init");
       return Response.ok().build();
    }

    @POST
    @Path("/run")
    public Response run() {
        System.out.println("/run");
        Message msg = new Message("hello");
        return Response.ok(msg).build();
    }

    @POST
    @Path("/")
    public Response root() {
        System.out.println("/root");
        Message msg = new Message("hello root");
        return Response.ok(msg).build();
    }

    @GET
    @Path("/health_check")
    public Response healthCheck() {
        System.out.println("/health_check");
        return Response.ok().build();
    }

}
