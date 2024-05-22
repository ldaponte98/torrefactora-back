package com.example.torrefactora.application.service;

import com.example.torrefactora.domain.entity.Task;

import java.util.List;

public interface IGetTasksService {
    List<Task> findAll();
}
