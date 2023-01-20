package com.java_practice.racingcar.exception;

public class TryCountTypeException extends IllegalArgumentException {
    public TryCountTypeException(String tryInput) {
        super(String.format("[ERROR] 시도할 회수 입력 타입을 숫자로 변환할수 없습니다. 입력된 값 \"%s\"", tryInput));
    }
}
