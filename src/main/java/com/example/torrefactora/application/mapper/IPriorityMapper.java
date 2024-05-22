package com.example.torrefactora.application.mapper;

import com.example.torrefactora.domain.entity.Priority;
import com.example.torrefactora.infrastructure.dto.PriorityDto;
import org.mapstruct.Mapper;

import java.util.List;
/**
 * Mapper IPriorityMapper
 * Mapper for Priority Entity and Priority DTO
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Mapper(componentModel = "spring")
public interface IPriorityMapper {
    List<PriorityDto> entityListToDtoList(List<Priority> entity);
}
