package com.java_practice.racingcar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private List<Car> cars;
    private Integer cnt;

    public Game(List<Car> cars, Integer cnt) {
        this.cars = cars;
        this.cnt = cnt;
    }

    public void play() {
        System.out.println("실행 결과");
        while(decreaseCnt() > 0) {
            round();
        }
    }

    public void result() {
        List<Car> winners = pickUpWinner();
        List<String> winnersName = winners.stream().map(Car::getName).collect(Collectors.toList());
        System.out.printf("최종 우승자 : %s\n", String.join(", ", winnersName));
    }

    private List<Car> pickUpWinner() {
        Integer maxReach = cars.stream().max(Comparator.comparing(Car::getPosition)).get().getPosition();
        List<Car> winners = cars.stream().
                filter(car -> car.getPosition() == maxReach).collect(Collectors.toList());
        return winners;
    }

    private Integer decreaseCnt() {
        return cnt--;
    }
    private void round() {
        cars.stream().forEach(Car::run);
        cars.stream().forEach(Car::printStatus);
        System.out.println("");
    }
}
