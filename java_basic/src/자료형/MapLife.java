package 자료형;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapLife {
    public static void main(String[] args) {
        // key:value 형태로 값을 얻는 자료형
        // 순차적으로 해당 요소 값을 구하지 않음
        // 대표적으로 HashMap이 존재
        // 입력된 순서대로 데이터를 저장하고 싶은 경우 LinkedHashMap,
        // 오름차순으로 정렬된 데이터를 저장하고 싶은경우 TreeMap을 사용
        HashMap<String, String> map = new HashMap<>();
        map.put("test", "test");
        map.put("ghdic", "god");
        System.out.println(map.get("ghdic"));
        System.out.println(map.get("zzz")); // key존재 안할 경우 null 반환
        // null 대신 default값을 얻고싶은 경우
        System.out.println(map.getOrDefault("zzz", "no!"));
        System.out.println(map.containsKey("ghdic"));
        System.out.println(map.keySet());
        List<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(map.remove("ghdic")); // value return
        System.out.println(map.size());
    }
}
