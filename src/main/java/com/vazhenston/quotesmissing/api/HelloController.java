package com.vazhenston.quotesmissing.api;

import com.vazhenston.quotesmissing.api.model.ResponseObject;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("helloController")
public class HelloController implements HelloApi {

    @Override
    public ResponseEntity<ResponseObject> hello() {
        return null;
    }
}
