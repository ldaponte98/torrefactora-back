package com.example.torrefactora.application.service;

import com.example.torrefactora.domain.entity.Status;

import java.util.List;

public interface IGetStatusService {
    List<Status> findAll();
}
