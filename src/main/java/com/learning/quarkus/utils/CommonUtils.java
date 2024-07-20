package com.learning.quarkus.utils;

import com.learning.quarkus.models.responses.AppResponse;

import java.util.ArrayList;

public class CommonUtils {
    private CommonUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> AppResponse buildResponse (T payload) {
        return AppResponse.builder()
                .hasError(false)
                .payload(payload)
                .errors(new ArrayList<>())
                .build();
    }
}
