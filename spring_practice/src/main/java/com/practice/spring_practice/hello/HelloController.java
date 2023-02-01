package com.practice.spring_practice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloDao helloDao;

    public HelloController(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "") String name) {
        if(name.isEmpty()) {
            return "Hello World!";
        }
        helloDao.insert(name);
        int count = helloDao.countByName(name);
        return String.format("Hello %s %d번째 방문입니다.", name, count);
    }
}
