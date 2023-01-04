package 자료형;

public class StringBufferLife {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // +연산자로 문자열 합치는 결과물과 같다
        // 다만 연산자를 사용 할 경우 연산이 있을때마다 String 객체가 생성된다(String 자료형은 immutable하기 때문)
        // StringBuilder 와 사용법은 동일, 멀티 스레드 환경에서 안전함(동기화 고려해야할 경우 씀)
        // StringBuilder가 성능이 더 우수하다(동기화 고려안할 경우 )
        sb.append("hello");sb.append(" ");sb.append("world");sb.append(10);
        String res = sb.toString();
        System.out.println(res);
        System.out.println("hello" + " " + "world" + 10);

        sb.insert(0, "hello "); // 특정 위치에 문자열 삽입
        System.out.println(sb.toString());
        System.out.println(sb.substring(0, 5)); // (start, end) 문자열 자르기

        sb.insert(sb.indexOf("hello") + 5, 10); // 특정 문자열 시작 위치 찾음
        System.out.println(sb.toString());

        sb.delete(sb.indexOf("hello") + 5, sb.indexOf("hello") + 7); // (start, end) 문자열 삭제
        System.out.println(sb.toString());

        sb.replace(0, 5, "hello10"); // 문자열 대치
        System.out.println(sb.toString());

    }
}
