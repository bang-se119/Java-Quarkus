package com.learning.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class UserControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/register")
          .then()
             .statusCode(200)
             .body(is("Register Successfully !"));
    }

}