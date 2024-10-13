package com.learning.quarkus.models.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUserRequest {
    private String username;
    private String password;
}
