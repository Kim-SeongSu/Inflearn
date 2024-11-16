package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        /*
        int basic = Grade.BASIC.discount(price);
        int gold = Grade.BASIC.discount(price);
        int diamond = Grade.BASIC.discount(price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
         */

        // Inline Variable (Ctrl + Alt + N)
        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.BASIC.discount(price));
    }
}
