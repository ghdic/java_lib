package com.java_practice.racingcar;

import camp.nextstep.edu.missionutils.Console;
import com.java_practice.racingcar.exception.CarNameLengthException;
import com.java_practice.racingcar.exception.TryCountTypeException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputManger {

    public static Integer inputTryCnt() {
        System.out.println("시도할 회수는 몇회인가요?");
        String tryInput = Console.readLine();
        Integer tryCnt = null;
        try {
            isInteger(tryInput);
            tryCnt = Integer.parseInt(tryInput);
        } catch (TryCountTypeException e) {
            System.out.println(e.getMessage());
            return inputTryCnt();
        }

        return tryCnt;
    }

    public static List<Car> inputCarNames() {
        List<String> carNames;

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carsInput = Console.readLine();
        try {
            carNames = Arrays.asList(carsInput.trim().split("\\s*,\\s*")); // split + erase blank
            carNames.stream().forEach(carName -> checkCarNameLength(carName));
        } catch (CarNameLengthException e) {
            System.out.println(e.getMessage());
            return inputCarNames();
        }

        List<Car> cars = carNames.stream().map(carName -> new Car(carName)).collect(Collectors.toList());
        return cars;
    }

    private static void checkCarNameLength(String carName) {
        if(carName.length() > 5) {
            throw new CarNameLengthException(carName);
        }
    }

    private static void isInteger(String str) {
        if(!str.matches("\\d+")) {
            throw new TryCountTypeException(str);
        }
    }
}
