package com.learning.quarkus.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.learning.quarkus.definitions.EmptyObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"has_error", "payload", "errors"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppResponse<T> {
    @JsonProperty("has_error")
    private Boolean hasError;
    private T payload;
    private List<EmptyObject> errors;
}
