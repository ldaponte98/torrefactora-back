package com.example.torrefactora.domain.repository;
import com.example.torrefactora.domain.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
    Status findByNameEquals(String name);
}
