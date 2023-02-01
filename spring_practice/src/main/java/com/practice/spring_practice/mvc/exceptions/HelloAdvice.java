package com.practice.spring_practice.mvc.exceptions;

import com.practice.spring_practice.mvc.exceptions.exception.HelloException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = ExceptionsController.class)
public class HelloAdvice {

    @ExceptionHandler(HelloException.class)
    public ResponseEntity<String> handle() {
        return ResponseEntity.badRequest().body("HelloException");
    }
}
