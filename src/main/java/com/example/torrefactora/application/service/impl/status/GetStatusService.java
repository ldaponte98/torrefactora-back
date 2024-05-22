package com.example.torrefactora.application.service.impl.status;

import com.example.torrefactora.application.service.IGetStatusService;
import com.example.torrefactora.domain.entity.Status;
import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.domain.repository.StatusRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
/**
 * Service GetStatusService
 * Service for get status
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Component
public class GetStatusService implements IGetStatusService {
    /**
     * statusRepository
     * repository of the status entity.
     */
    public final StatusRepository statusRepository;
    /**
     * Injection dependencies
     * Constructor with all arguments of the class.
     * @param statusRepository repository of status.
     */
    public GetStatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }
    /**
     * Find all status
     * This method allows you to consult all registered status.
     * @return list of status.
     */
    @Override
    public List<Status> findAll() {
        return StreamSupport.stream(this.statusRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
