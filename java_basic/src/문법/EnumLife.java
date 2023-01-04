package 문법;

// 서로 관련있는 여러개의 상수집합 정의
enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
}

public class EnumLife {
    public static void main(String[] args) {
        System.out.println(getCoffeePrice(CoffeeType.CAFE_LATTE));
    }

    // 상수를 넘기는거보다 코드의 직관성이 높아짐
    static int getCoffeePrice(CoffeeType type) {
        int price = 3500;

        switch (type) {
            case AMERICANO -> price = 5000;
            case ICE_AMERICANO -> price = 5500;
            case CAFE_LATTE -> price = 4000;
            default -> price = 3500;
        }

        return price;
    }
}
