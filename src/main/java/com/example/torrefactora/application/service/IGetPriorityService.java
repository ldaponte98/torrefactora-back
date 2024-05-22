package com.example.torrefactora.application.service;
import com.example.torrefactora.domain.entity.Priority;
import java.util.List;

public interface IGetPriorityService {
    List<Priority> findAll();
}

