package com.example.torrefactora.domain.repository;
import com.example.torrefactora.domain.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository Priority
 * Representation of an access orm to persistence entity
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer> {

}