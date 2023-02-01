package com.practice.spring_practice.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {

    Hello save(Hello hello);
    Integer countHelloByName(String name);
}
