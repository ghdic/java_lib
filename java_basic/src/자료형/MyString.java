package 자료형;

import java.util.Arrays;
import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String a = "Hello World"; // 리터럴 표기, intern pool에 저장
        String b = new String("Hello World"); // 방식이 다름

        // 자주 쓰는 String 내장메소드
        System.out.println(a.equals(b)); // 문자열 비교시에는 equals 사용, 객체에서 ==은 동일한 객체인지 판별할때 씀
        System.out.println(a.indexOf("Wor")); // 특정 문자열 시작되는 위치
        System.out.println(a.contains("Hello")); // 특정 문자열이 포함되어있는지
        System.out.println(a.charAt(6)); // 해당 인덱스의 문자
        System.out.println(a.replaceAll("Hello", "Hell")); // 본체는 바뀌지 않음
        System.out.println(a.substring(1, 4)); // 시작위치 <= c < 끝위치
        System.out.println(a.toUpperCase(Locale.KOREA));
        System.out.println(a.split(" ")); // return String[]


        System.out.println(String.format("Hello %d %s", 3, "peoples"));
        System.out.printf("Hello %d %s\n", 3, "peoples");
    }
}
