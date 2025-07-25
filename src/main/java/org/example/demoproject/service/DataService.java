package org.example.demoproject.service;

import org.example.demoproject.Repo.DataRepo;
import org.example.demoproject.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    public DataRepo repo;
    public ResponseEntity<List<Students>> getData() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }
}
