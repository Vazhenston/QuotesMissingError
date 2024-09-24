package com.vazhenston.quotesmissing.api;

import com.vazhenston.quotesmissing.api.model.ResponseObject;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "example/api")
@Tag(name = "Hello API")
public interface HelloApi {

    @Operation(
            parameters = {
                    @Parameter(ref = "./common/common_openapi.yaml#/components/parameters/HeaderAcceptLang"),
            }
    )
    @GetMapping("/hello")
    ResponseEntity<ResponseObject> hello();
}
