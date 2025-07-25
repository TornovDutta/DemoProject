package org.example.demoproject.service;

import org.example.demoproject.Repo.DataRepo;
import org.example.demoproject.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class DataService {
    @Autowired
    public DataRepo repo;
    public ResponseEntity<List<Students>> getData() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<String> upload() {
        Students st1 = new Students();
        st1.setName("Tornov");

        Students st2 = new Students();
        st2.setName("Ram");

        Students st3 = new Students();
        st3.setName("Sham");

        List<Students> studentList = Arrays.asList(st1, st2, st3);
        repo.saveAll(studentList);

        return new ResponseEntity<>("Ok", HttpStatus.OK);

    }

    public ResponseEntity<String> delete() {
        repo.deleteAll();
        return new ResponseEntity<>("Ok",HttpStatus.OK);
    }
}
