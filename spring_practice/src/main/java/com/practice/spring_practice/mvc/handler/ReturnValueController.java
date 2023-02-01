package com.practice.spring_practice.mvc.handler;

import com.practice.spring_practice.mvc.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/return-value")
public class ReturnValueController {

    @ResponseBody
    @GetMapping("/message")
    public String string() {
        return "message";
    }

    @ResponseBody
    @GetMapping("/users")
    public User responseBodyForUser() {
        return new User("name", "email");
    }

    @ResponseBody
    @GetMapping("/users/{id}")
    public ResponseEntity<User> responseEntity(@PathVariable Long id) {
        return ResponseEntity.ok(new User("name", "email"));
    }

    @GetMapping("/members")
    public ResponseEntity responseEntityFor400() {
        return ResponseEntity.badRequest().build();
    }
}