package com.practice.spring_practice.core.di;

import org.springframework.stereotype.Repository;

@Repository
public class StationRepository {
    public String sayHi() {
        return "Hi";
    }
}
