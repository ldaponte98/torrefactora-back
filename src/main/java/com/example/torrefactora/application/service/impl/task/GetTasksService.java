package com.example.torrefactora.application.service.impl.task;

import com.example.torrefactora.application.service.IGetTasksService;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.PriorityRepository;
import com.example.torrefactora.domain.repository.StatusRepository;
import com.example.torrefactora.domain.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class GetTasksService extends TaskService implements IGetTasksService {
    public GetTasksService(TaskRepository taskRepository, StatusRepository statusRepository, PriorityRepository priorityRepository) {
        super(taskRepository, statusRepository, priorityRepository);
    }

    @Override
    public List<Task> findAll() {
        return StreamSupport.stream(this.taskRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
