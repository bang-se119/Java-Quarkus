package com.learning.quarkus.services;

import com.learning.quarkus.models.requests.LoginUserRequest;
import com.learning.quarkus.models.requests.RegisterUserRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
    public void register (RegisterUserRequest registerUserRequest) {
        System.out.println("Start register. Check information!");
        System.out.println(registerUserRequest);
    }

    public void login (LoginUserRequest loginUserRequest) {
        System.out.println("Start login. Get token!");
        System.out.println(loginUserRequest);
    }

    public String getUserInfo (String uid) {
        return "User Information from id is: " + uid;
    }
}
