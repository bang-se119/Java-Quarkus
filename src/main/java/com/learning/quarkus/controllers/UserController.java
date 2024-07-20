package com.learning.quarkus.controllers;

import com.learning.quarkus.definitions.EmptyObject;
import com.learning.quarkus.models.responses.AppResponse;
import com.learning.quarkus.services.UserService;
import com.learning.quarkus.utils.CommonUtils;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserService userService;

    @POST
    @Path("/B1-register-user")
    public AppResponse<EmptyObject> registerUser() throws Exception {
        userService.register();
        return CommonUtils.buildResponse(new EmptyObject());
    }
}
