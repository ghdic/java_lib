package com.practice.spring_practice.mvc.exceptions;

import com.practice.spring_practice.mvc.exceptions.exception.CustomException;
import com.practice.spring_practice.mvc.exceptions.exception.HelloException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exceptions")
public class ExceptionsController {

    @GetMapping("/hello")
    public ResponseEntity exceptionHandler() {
        throw new CustomException();
    }


    @GetMapping("/hi")
    public ResponseEntity exceptionHandler2() {
        throw new HelloException();
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handle() {
        return ResponseEntity.badRequest().body("CustomException");
    }
}