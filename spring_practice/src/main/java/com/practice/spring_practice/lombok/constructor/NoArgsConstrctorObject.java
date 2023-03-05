package com.practice.spring_practice.lombok.constructor;

import lombok.NoArgsConstructor;

// 파라미터가 없는 기본 생성자를 생성
// force=true 옵션을 쓰면 final field는 모두 0 / false / null로 초기화
@NoArgsConstructor
public class NoArgsConstrctorObject {
    long id;
    String name;
    int number;


}
