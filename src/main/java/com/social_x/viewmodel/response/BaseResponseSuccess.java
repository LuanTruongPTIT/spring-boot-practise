package com.social_x.viewmodel.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record BaseResponseSuccess(
    @Schema(type = "string", description = "Request Id", example = "d2648c53-c78a-4465-850f-995d2a060a31") String requestID,

    @Schema(type = "string", example = "/api/v1/hello") String path,

    @Schema(type = "int", description = "Staus code", example = "200") int statusCode,

    @Schema(type = "string", example = "Create success") String message) {

}
