package com.example.customerserver.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}
