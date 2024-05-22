package com.example.torrefactora.application.mapper;

import com.example.torrefactora.domain.entity.Status;
import com.example.torrefactora.infrastructure.dto.StatusDto;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IStatusMapper {
    List<StatusDto> entityListToDtoList(List<Status> entity);
}
