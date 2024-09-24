package com.vazhenston.quotesmissing.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class ResponseObject {
    @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String text;
}
