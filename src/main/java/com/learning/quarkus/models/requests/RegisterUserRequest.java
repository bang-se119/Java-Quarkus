package com.learning.quarkus.models.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterUserRequest {
    private String name;
    private String username;
    private String email;
    private String password;
}
