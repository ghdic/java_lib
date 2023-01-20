package com.java_practice.racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void run() {
        Integer randomNumber = Randoms.pickNumberInRange(0, 9);

        if(randomNumber >= 4) {
            forward();
        }
    }

    public void printStatus() {
        System.out.printf("%s :\t%s\n", this.name, "-".repeat(position));
    }

    private void forward() {
        position++;
    }
}