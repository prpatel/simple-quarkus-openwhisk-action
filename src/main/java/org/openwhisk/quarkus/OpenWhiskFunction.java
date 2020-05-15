package org.openwhisk.quarkus;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
@Produces("application/json")
@Consumes("application/json")
public class OpenWhiskFunction {

    @POST
    @Path("/init")
    public Response init() {
       return Response.ok().build();
    }

    @POST
    @Path("/run")
    public Response run() {
        Message msg = new Message("hello");
        return Response.ok(msg).build();
    }

}
