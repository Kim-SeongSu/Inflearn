package enumeration.ref1;

import enumeration.ex2.DiscountService;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);    // x001
    public static final ClassGrade GOLD = new ClassGrade(20);     // x002
    public static final ClassGrade DIAMOND = new ClassGrade(30);  // x003

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public static class ClassGradeRefMain1 {
        public static void main(String[] args) {
            int price = 10000;

            enumeration.ex2.DiscountService discountService = new DiscountService();

            int basic = discountService.discount(enumeration.ex2.ClassGrade.BASIC,price);
            int gold = discountService.discount(enumeration.ex2.ClassGrade.GOLD,price);
            int diamond = discountService.discount(enumeration.ex2.ClassGrade.DIAMOND,price);

            System.out.println("BASIC 등급의 할인 금액: " + basic);
            System.out.println("GOLD 등급의 할인 금액: " + gold);
            System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
        }
    }
}
