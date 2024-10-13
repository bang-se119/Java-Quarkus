package com.learning.quarkus.controllers;

import com.learning.quarkus.definitions.EmptyObject;
import com.learning.quarkus.models.requests.LoginUserRequest;
import com.learning.quarkus.models.requests.RegisterUserRequest;
import com.learning.quarkus.models.responses.AppResponse;
import com.learning.quarkus.services.UserService;
import com.learning.quarkus.utils.CommonUtils;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
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
    public AppResponse<EmptyObject> registerUser(@Valid RegisterUserRequest registerUserRequest) throws Exception {
        userService.register(registerUserRequest);
        return CommonUtils.buildResponse(new EmptyObject());
    }

    @POST
    @Path("/B2-login-user")
    public AppResponse<EmptyObject> loginUser(@Valid LoginUserRequest loginUserRequest) throws Exception {
        userService.login(loginUserRequest);
        return CommonUtils.buildResponse(new EmptyObject());
    }

    @GET
    @Path("/B3-user-info/{uid}")
    public AppResponse<EmptyObject> getUserInfo(@PathParam("uid") String uid) throws Exception {
        return CommonUtils.buildResponse(userService.getUserInfo(uid));
    }
}
