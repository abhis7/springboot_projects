// src/main/java/com/example/demo/controller/MyController.java
package com.example.demofirst.controller;

import com.example.demofirst.model.MyData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/receive-data")
    public String receiveData(@RequestBody MyData myData) {
        // Process the received data
        return "Received: " + myData.getFirstname() + " " + myData.getLastname();

    }
}
