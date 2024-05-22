package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import com.example.torrefactora.infrastructure.exception.InvalidValueException;
import com.example.torrefactora.shared.Messages;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TaskService {
    public final TaskRepository taskRepository;
    public final StatusRepository statusRepository;
    public final PriorityRepository priorityRepository;
    public void validateReferences(Task task) {
        if(!this.statusRepository.existsById(task.getStatus().getId()))
            throw new InvalidValueException(Messages.STATUS_INVALID);
        if(!this.priorityRepository.existsById(task.getPriority().getId()))
            throw new InvalidValueException(Messages.PRIORITY_INVALID);
    }
}
