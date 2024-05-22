package com.example.torrefactora.infrastructure.controller;

import com.example.torrefactora.application.mapper.ITaskMapper;
import com.example.torrefactora.application.service.ICreateTaskService;
import com.example.torrefactora.application.service.IGetTasksService;
import com.example.torrefactora.application.service.IUpdateTaskService;
import com.example.torrefactora.infrastructure.dto.CreateTaskDto;
import com.example.torrefactora.infrastructure.dto.GetTasksDto;
import com.example.torrefactora.infrastructure.dto.UpdateTaskDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Slf4j
@RestController
@RequestMapping(value = "/api/tasks")
@AllArgsConstructor
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class TaskController {
    private final ITaskMapper taskMapper;
    private final ICreateTaskService createTaskService;
    private final IGetTasksService getTasksService;
    private final IUpdateTaskService updateTaskService;
    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "create", notes = "Consulta listado de tareas.")
    @ApiResponses(value = { @ApiResponse(code = 201, message = "Tarea creada exitosamente."),
    @ApiResponse(code = 400, message = "Bad Request. El request solicitado tiene problemas sintácticos o semánticos, revisar el ejemplo api-doc provisto"), })
    public ResponseEntity create(@ApiParam(value = "createTaskDto", required = true) @RequestBody CreateTaskDto dto) {
        log.info("Create new task");
        createTaskService.create(taskMapper.dtoToEntity(dto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "all", notes = "Consulta listado de tareas.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Consulta exitosa."),
    @ApiResponse(code = 500, message = "Ocurrio un error inesperado con el sistema"), })
    public ResponseEntity<List<GetTasksDto>> findAll() {
        log.info("Find all tasks request");
        var result = taskMapper.entityListToDtoList(getTasksService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "update", notes = "Actualizacion de datos de una tarea.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Tarea actualizada exitosamente."),
            @ApiResponse(code = 400, message = "Bad Request. El request solicitado tiene problemas sintácticos o semánticos, revisar el ejemplo api-doc provisto"),
            @ApiResponse(code = 404, message = "Not Found. No se encontro la tarea"),
    })
    public ResponseEntity update(
            @ApiParam(value = "id", required = true) @PathVariable("id") Integer id,
            @ApiParam(value = "updateTaskDto", required = true) @RequestBody UpdateTaskDto dto) {
        log.info("Update task " + id);
        updateTaskService.update(id, taskMapper.dtoToEntity(dto));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
