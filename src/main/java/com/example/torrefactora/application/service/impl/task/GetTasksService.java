package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.application.service.IGetTasksService;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import com.example.torrefactora.infrastructure.exception.InvalidValueException;
import com.example.torrefactora.infrastructure.exception.NotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
/**
 * Service GetTasksService
 * Service for get tasks
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Component
public class GetTasksService extends TaskService implements IGetTasksService {
    /**
     * Injection dependencies
     * Constructor with all arguments of the class.
     * @param taskRepository repository of task.
     * @param statusRepository repository of status.
     * @param priorityRepository repository of priority.
     */
    public GetTasksService(TaskRepository taskRepository, StatusRepository statusRepository, PriorityRepository priorityRepository) {
        super(taskRepository, statusRepository, priorityRepository);
    }
    /**
     * Find all tasks
     * This method allows you to consult all registered tasks.
     * @return list of task.
     */
    @Override
    public List<Task> findAll() {
        return StreamSupport.stream(this.taskRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
