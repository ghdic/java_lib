package com.java_practice.racingcar;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        List<Car> cars = InputManger.inputCarNames();
        Integer tryCnt = InputManger.inputTryCnt();

        Game game = new Game(cars, tryCnt);
        game.play();
        game.result();
    }


}
