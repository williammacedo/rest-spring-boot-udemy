package br.com.example.restspringbootudemy.exception;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    private LocalDate timestamp;

    @Getter
    private String message;

    @Getter
    private String details;

    public ExceptionResponse(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
