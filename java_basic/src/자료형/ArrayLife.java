package 자료형;

public class ArrayLife {
    public static void main(String[] args) {
        int[] oods = {1, 3, 5, 7, 9}; // 배열은 자료형의 집합
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        int[] evens = new int[5]; // 동적 할당할때, 길이에 대한 정의가 있어야함
        evens[0] = 2;evens[1] = 4; evens[2] = 6; evens[3] = 8; evens[4] = 10;
        for(int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
    }
}
