package com.learning.quarkus.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
    public void register () {
        System.out.println("Start register. Check information!");
    }
}
