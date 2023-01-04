package 자료형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListLife {
    public static void main(String[] args) {
        // List는 배열과 비슷하나, 크기가 정해져 있지않고 동적으로 변함
        // List자료형에는 ArrayList, Vector, LinkedList 존재
        ArrayList<String> numbers = new ArrayList();
        // 제네릭 없으면 에러 안나고.. 여러자료형 추가 가능, 제네럭 Object로 잡히는듯
        // numbers.add(123);
        numbers.add("456");
        numbers.add("789");
        numbers.add(0, "0"); // 특정 위치 삽입

        System.out.println(numbers.get(2));
        System.out.println(numbers.getClass().getName()); // 타입확인
        System.out.println(numbers.size());
        System.out.println(numbers.contains("456"));
        System.out.println(numbers.remove("123")); // 실패시 false반환, 인자에 객체 or 인덱스를 넣을 수 있음

        String[] data = {"456", "789", "123"};
        // array -> arrayList, new ArrayList<>(Arrays.asList("456", "789", 123"); 동치
        ArrayList<String> converts = new ArrayList<>(Arrays.asList(data));

        converts.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(converts);
    }
}
