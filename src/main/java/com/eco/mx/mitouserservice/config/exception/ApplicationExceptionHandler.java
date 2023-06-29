package com.eco.mx.mitouserservice.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {
    //Response será contumisado por esto
    @ExceptionHandler({NullPointerException.class})
    public ResponseEntity<Map<String, Object>> userEntityException(NullPointerException exception){
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Bad Request");
        response.put("reponseCode", 400);
        response.put("errorDetails", exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

}


