package com.pucprojperiodo2.farmacia.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping( value = "/api/status")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("Online");
    }
}
