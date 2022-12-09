package 자료형;

public class BasicType {
    public static void main(String[] args) {
        // 원시 자료형
        int age = 10; // -2147483648 ~ 2147483647 4bytes
        int octal = 023;
        int hex = 0xC1;
        long money = 10000L; // -9223372036854775808 ~ 9223372036854775807 8bytes
        float pi = 3.14F; // -3.4 * 10^38 ~ 3.4 * 10^38
        double morePi = 3.14159265358979323846; // -1.7 * 10^308 ~ 1.7 * 10^308
        boolean check = 10 > 3;
        char c = 'a';

        // Wrapper 클래스
        // Integer, Long, Double, Float, Boolean, Char
        // 값 대신 객체를 주고 받을 수 있어 코드를 객체 중심적으로 작성시 유리, 멀티스레딩 환경에서 동기화 유리
    }
}
