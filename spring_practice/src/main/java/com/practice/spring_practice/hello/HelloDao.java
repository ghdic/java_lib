package com.practice.spring_practice.hello;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
    private HelloRepository helloRepository;

    public HelloDao(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public void insert(String name) {
        Hello hello = new Hello();
        hello.setName(name);
        helloRepository.save(hello);
    }

    public int countByName(String name) {
        return helloRepository.countHelloByName(name);
    }
}
