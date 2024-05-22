package com.example.torrefactora.application.service;

import com.example.torrefactora.domain.entity.Task;

public interface IUpdateTaskService {
    void update(int id, Task task);
}
