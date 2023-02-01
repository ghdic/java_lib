package com.practice.spring_practice.mvc.mapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok().body("message");
    }

    @GetMapping(value = "/message", params = "name")
    public ResponseEntity<String> messageForParam(@RequestParam String name) {
        return ResponseEntity.ok().body("hello");
    }

    @GetMapping(value = "/message", headers = "HEADER")
    public ResponseEntity<String> messageForHeader(@RequestHeader String header) {
        return ResponseEntity.ok().body("hi");
    }
}