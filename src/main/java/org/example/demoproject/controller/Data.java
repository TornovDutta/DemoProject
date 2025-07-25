package org.example.demoproject.controller;

import org.example.demoproject.model.Students;
import org.example.demoproject.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Data {
    @Autowired
    private DataService service;
    @GetMapping("/data")
    public ResponseEntity<List<Students> > getData() {
        return service.getData();
    }
}
