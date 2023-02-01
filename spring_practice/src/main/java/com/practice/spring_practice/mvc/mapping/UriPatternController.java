package com.practice.spring_practice.mvc.mapping;

import com.practice.spring_practice.mvc.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uri-pattern")
public class UriPatternController {

    @GetMapping("/users/{id}")
    public ResponseEntity<User> pathVariable(@PathVariable(name = "id") Long id) {
        User user = new User(id, "이름", "email");
        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = {"/patterns/a", "/patterns/b"})
    public ResponseEntity<String> pattern() {
        return ResponseEntity.ok().body("pattern");
    }

    @GetMapping("/patterns/**")
    public ResponseEntity<String> patternStars() {
        return ResponseEntity.ok().body("pattern-multi");
    }
}