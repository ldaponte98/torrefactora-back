package com.example.torrefactora.infrastructure.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Getter
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private final String message;

    public NotFoundException(String message) {
        super(message);
        this.message = message;
    }

}

