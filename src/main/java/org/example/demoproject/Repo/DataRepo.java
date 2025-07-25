package org.example.demoproject.Repo;

import org.example.demoproject.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<Students,Integer> {
}
