package com.example.torrefactora.domain.repository;
import com.example.torrefactora.domain.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository Task
 * Representation of an access orm to persistence entity
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
