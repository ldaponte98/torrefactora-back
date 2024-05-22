package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.application.service.ICreateTaskService;
import com.example.torrefactora.domain.constants.StatusName;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CreateTaskService extends TaskService implements ICreateTaskService {
    public CreateTaskService(TaskRepository taskRepository, StatusRepository statusRepository, PriorityRepository priorityRepository) {
        super(taskRepository, statusRepository, priorityRepository);
    }
    @Override
    public void create(Task task) {
        var status = this.statusRepository.findByNameEquals(StatusName.STARTED);
        task.setStatus(status);
        this.validateReferences(task);
        task.setCreatedAt(new Date());
        this.taskRepository.save(task);
    }
}
