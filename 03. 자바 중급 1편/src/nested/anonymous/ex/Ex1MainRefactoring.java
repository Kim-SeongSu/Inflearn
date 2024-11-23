package nested.anonymous.ex;

import java.util.Random;

public class Ex1MainRefactoring {
    public static void hello() {
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);

        System.out.println("프로그램 시작");

        for (int i=1; i<=randomValue; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello();
    }
}
