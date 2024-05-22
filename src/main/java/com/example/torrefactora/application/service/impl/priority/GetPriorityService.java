package com.example.torrefactora.application.service.impl.priority;

import com.example.torrefactora.application.service.IGetPriorityService;
import com.example.torrefactora.domain.entity.Priority;
import com.example.torrefactora.domain.repository.PriorityRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
/**
 * Service GetPriorityService
 * Service for get priorities
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Component
public class GetPriorityService implements IGetPriorityService {
    /**
     * priorityRepository
     * repository of the priority entity.
     */
    public final PriorityRepository priorityRepository;
    /**
     * Injection dependencies
     * Constructor with all arguments of the class.
     * @param priorityRepository repository of priority.
     */
    public GetPriorityService(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }
    /**
     * Find all priorities
     * This method allows you to consult all registered priorities.
     * @return list of priorities.
     */
    @Override
    public List<Priority> findAll() {
        return StreamSupport.stream(this.priorityRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
