package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.application.service.IUpdateTaskService;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import com.example.torrefactora.infrastructure.exception.NotFoundException;
import com.example.torrefactora.shared.Messages;
import org.springframework.stereotype.Component;

@Component
public class UpdateTaskService extends TaskService implements IUpdateTaskService {
    public UpdateTaskService(TaskRepository taskRepository, StatusRepository statusRepository, PriorityRepository priorityRepository) {
        super(taskRepository, statusRepository, priorityRepository);
    }
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
