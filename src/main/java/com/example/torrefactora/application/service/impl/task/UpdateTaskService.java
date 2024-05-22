package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.application.service.IUpdateTaskService;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import com.example.torrefactora.infrastructure.exception.InvalidValueException;
import com.example.torrefactora.infrastructure.exception.NotFoundException;
import com.example.torrefactora.shared.Messages;
import org.springframework.stereotype.Component;
/**
 * Service UpdateTaskService
 * Service for update task
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Component
public class UpdateTaskService extends TaskService implements IUpdateTaskService {
    /**
     * Injection dependencies
     * Constructor with all arguments of the class.
     * @param taskRepository repository of task.
     * @param statusRepository repository of status.
     * @param priorityRepository repository of priority.
     */
    public UpdateTaskService(TaskRepository taskRepository, StatusRepository statusRepository, PriorityRepository priorityRepository) {
        super(taskRepository, statusRepository, priorityRepository);
    }
    /**
     * Update task
     * This method allows you to update a task in data persistence based on the entity's data.
     * @param task object to create.
     * @exception InvalidValueException
     * @exception NotFoundException task not found
     * @throws IllegalArgumentException format invalid
     */
    @Override
    public void update(int id, Task task) {
        this.validateReferences(task);
        var search = this.taskRepository.findById(id);
        if(!search.isPresent()) throw new NotFoundException(Messages.TASK_NOT_FOUND);
        task.setId(id);
        task.setCreatedAt(search.get().getCreatedAt());
        this.taskRepository.save(task);
    }
}
