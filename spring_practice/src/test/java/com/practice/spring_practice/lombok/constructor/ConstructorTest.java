package com.practice.spring_practice.lombok.constructor;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConstructorTest {

    @Test
    @DisplayName("NoArgsConstructorObject 생성자 테스트")
    void NoArgsConstructorObject_생성자_테스트() {
        // 아무 필드도 주입해주지 않는 생선자
        NoArgsConstrctorObject object = new NoArgsConstrctorObject();
    }

    @Test
    void AllArgsConstructorObject_생성자_테스트() {
        // 모든 필드 생성자 주입
        AllArgsConstructorObject object = new AllArgsConstructorObject(1L, "object", 10);
    }

    @Test
    void RequiredArgsConstructorObject_생성자_테스트() {
        // final, @NonNull 이 붙은 필드만 생성자 주입
        //
        RequiredArgsConstructorObject requiredArgsConstructorObject = new RequiredArgsConstructorObject("object", 10);
    }
}
