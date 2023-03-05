package com.practice.spring_practice.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @staticName: 정적 팩토리 메소드 private으로 생성하여
 * 내부 기본 생성자를 생성
 * @access: 접근 제한자를 지정
 * @onConstructor: 생성자의 어노테이션을 지정
 */
@RequiredArgsConstructor
public class RequiredArgsConstructorObject {
    long id;
    final String name;
    @NonNull
    int number;
}
