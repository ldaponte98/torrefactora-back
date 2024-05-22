package com.example.torrefactora.application.mapper;

import com.example.torrefactora.domain.entity.Priority;
import com.example.torrefactora.infrastructure.dto.PriorityDto;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IPriorityMapper {
    List<PriorityDto> entityListToDtoList(List<Priority> entity);
}
