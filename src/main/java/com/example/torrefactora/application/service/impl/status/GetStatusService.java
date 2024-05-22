package com.example.torrefactora.application.service.impl.status;

import com.example.torrefactora.application.service.IGetStatusService;
import com.example.torrefactora.domain.entity.Status;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.StatusRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class GetStatusService implements IGetStatusService {
    public final StatusRepository statusRepository;

    public GetStatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }
    @Override
    public List<Status> findAll() {
        return StreamSupport.stream(this.statusRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
