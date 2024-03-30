package com.example.medsheduleserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    public ResponseEntity<String> notifyUser() {


        return ResponseEntity.ok("The event was sent");
    }

}
