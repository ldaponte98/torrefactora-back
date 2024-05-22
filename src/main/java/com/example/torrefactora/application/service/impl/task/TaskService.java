package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import com.example.torrefactora.infrastructure.exception.InvalidValueException;
import com.example.torrefactora.shared.Messages;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
/**
 * Class TaskService
 * Class guide for services task
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Component
@AllArgsConstructor
public class TaskService {
    /**
     * taskRepository
     * repository of the task entity.
     */
    public final TaskRepository taskRepository;
    /**
     * statusRepository
     * repository of the status entity.
     */
    public final StatusRepository statusRepository;
    /**
     * priorityRepository
     * repository of the priority entity.
     */
    public final PriorityRepository priorityRepository;

    /**
     * Validate References
     * This method allows you to validate that the foreign keys exist.
     * @param task object to create.
     * @exception InvalidValueException
     */
    public void validateReferences(Task task) {
        if(!this.statusRepository.existsById(task.getStatus().getId()))
            throw new InvalidValueException(Messages.STATUS_INVALID);
        if(!this.priorityRepository.existsById(task.getPriority().getId()))
            throw new InvalidValueException(Messages.PRIORITY_INVALID);
    }
}
