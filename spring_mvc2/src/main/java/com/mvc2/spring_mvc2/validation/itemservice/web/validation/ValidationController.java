package com.mvc2.spring_mvc2.validation.itemservice.web.validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validation")
public class ValidationController {
    @GetMapping("")
    public String index() {
        return "redirect:/validation/index.html";
    }
}
