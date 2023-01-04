package 자료형;

import java.util.Arrays;
import java.util.HashSet;

public class SetLife {
    public static void main(String[] args) {
        // HashSet, TreeSet, LinkedHashSet 등의 자료형 존재
        // 중복 허용 x, 순서 보장 x
        // TreeSet - 오름차순 정렬 저장, LinkedHashSet = 입력한 순서대로 정렬 저장
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "L", "L", "O"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2); // 합집합 수행
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);

        set.add("World");
        set.addAll(Arrays.asList("Togeather", "HELL", "World"));
        set.remove("E");
        System.out.println(set);
    }
}
