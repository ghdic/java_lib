package com.practice.spring_practice.core.di;

public class StationSetterService {
    private StationRepository stationRepository;

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
