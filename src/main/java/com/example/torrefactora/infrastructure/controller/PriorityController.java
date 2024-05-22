package com.example.torrefactora.infrastructure.controller;

import com.example.torrefactora.application.mapper.IPriorityMapper;
import com.example.torrefactora.application.service.IGetPriorityService;
import com.example.torrefactora.infrastructure.dto.PriorityDto;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping(value = "/api/priorities")
@AllArgsConstructor
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class PriorityController {
    private final IPriorityMapper mapper;
    private final IGetPriorityService getPriorityService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "all", notes = "Consulta listado de prioridades.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Consulta exitosa."),
            @ApiResponse(code = 500, message = "Ocurrio un error inesperado con el sistema"), })
    public ResponseEntity<List<PriorityDto>> findAll() {
        log.info("Find all priorities request");
        var result = mapper.entityListToDtoList(getPriorityService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
