package com.example.torrefactora.application.mapper;

import com.example.torrefactora.domain.entity.Status;
import com.example.torrefactora.infrastructure.dto.StatusDto;
import org.mapstruct.Mapper;

import java.util.List;
/**
 * Mapper IStatusMapper
 * Mapper for Status Entity and Status DTO
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Mapper(componentModel = "spring")
public interface IStatusMapper {
    List<StatusDto> entityListToDtoList(List<Status> entity);
}
