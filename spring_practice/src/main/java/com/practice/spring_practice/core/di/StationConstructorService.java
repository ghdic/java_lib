package com.practice.spring_practice.core.di;

public class StationConstructorService {
    private StationRepository stationRepository;

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
