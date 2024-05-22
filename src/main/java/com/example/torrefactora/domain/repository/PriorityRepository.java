package com.example.torrefactora.domain.repository;
import com.example.torrefactora.domain.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer> {

}