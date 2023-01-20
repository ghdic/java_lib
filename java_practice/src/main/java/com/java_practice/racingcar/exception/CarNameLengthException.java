package com.java_practice.racingcar.exception;

public class CarNameLengthException extends IllegalArgumentException {

    public CarNameLengthException(String carName) {
        super(String.format("[ERROR] 자동차 이름 길이는 5글자 이하여야 합니다. %s는 %d글자 입니다.", carName, carName.length()));
    }
}
