package com.example.torrefactora.domain.repository;
import com.example.torrefactora.domain.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository Status
 * Representation of an access orm to persistence entity
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
    Status findByNameEquals(String name);
}
