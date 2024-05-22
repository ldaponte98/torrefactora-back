package com.example.torrefactora.application.mapper;

import com.example.torrefactora.domain.entity.Task;
import com.example.torrefactora.infrastructure.dto.CreateTaskDto;
import com.example.torrefactora.infrastructure.dto.GetTasksDto;
import com.example.torrefactora.infrastructure.dto.UpdateTaskDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ITaskMapper {
    @Mapping(target = "priority.id", source = "dto.priority_id")
    Task dtoToEntity(CreateTaskDto dto);

    @Mapping(target = "status.id", source = "dto.status_id")
    @Mapping(target = "priority.id", source = "dto.priority_id")
    Task dtoToEntity(UpdateTaskDto dto);
    List<GetTasksDto> entityListToDtoList(List<Task> entity);
}
