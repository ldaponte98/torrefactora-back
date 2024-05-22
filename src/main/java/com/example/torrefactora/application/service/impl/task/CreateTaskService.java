package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.application.service.ICreateTaskService;
import com.example.torrefactora.domain.constants.StatusName;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import com.example.torrefactora.infrastructure.exception.InvalidValueException;
import org.springframework.stereotype.Component;

import java.util.Date;
/**
 * Service CreateTaskService
 * Service for create task
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Component
public class CreateTaskService extends TaskService implements ICreateTaskService {
    /**
     * Injection dependencies
     * Constructor with all arguments of the class.
     * @param taskRepository repository of task.
     * @param statusRepository repository of status.
     * @param priorityRepository repository of priority.
     */
    public CreateTaskService(TaskRepository taskRepository, StatusRepository statusRepository, PriorityRepository priorityRepository) {
        super(taskRepository, statusRepository, priorityRepository);
    }
    /**
     * Create task
     * This method allows you to create a task in data persistence based on the entity's data.
     * @param task object to create.
     * @exception InvalidValueException
     * @throws IllegalArgumentException el task no tiene el formato deseado
     */
    @Override
    public void create(Task task) {
        var status = this.statusRepository.findByNameEquals(StatusName.STARTED);
        task.setStatus(status);
        this.validateReferences(task);
        task.setCreatedAt(new Date());
        this.taskRepository.save(task);
    }
}
