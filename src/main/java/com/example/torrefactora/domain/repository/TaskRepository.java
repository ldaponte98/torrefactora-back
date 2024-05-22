package com.example.torrefactora.domain.repository;
import com.example.torrefactora.domain.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
