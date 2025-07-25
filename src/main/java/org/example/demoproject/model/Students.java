package org.example.demoproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Students {
    @Id
    private int id;
    private String name;
}
