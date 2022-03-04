package com.corattori.measurementunits.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saluto {

    @GetMapping("/hello")
    public String saluto() {
        return "ciao";
    }

}
