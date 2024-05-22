package com.example.torrefactora.application.service.impl.priority;

import com.example.torrefactora.application.service.IGetPriorityService;
import com.example.torrefactora.domain.entity.Priority;
import com.example.torrefactora.domain.repository.PriorityRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class GetPriorityService implements IGetPriorityService {
    public final PriorityRepository priorityRepository;

    public GetPriorityService(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }
    @Override
    public List<Priority> findAll() {
        return StreamSupport.stream(this.priorityRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
