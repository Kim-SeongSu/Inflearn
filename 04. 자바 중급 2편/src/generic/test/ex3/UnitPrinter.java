/*
문제와 풀이3 - 제네릭 메서드와 와일드카드
문제 설명
    앞서 문제에서 만든 Shuttle 을 활용한다.
    다음 코드와 실행 결과를 참고해서 UnitPrinter 클래스를 만들어라.
    UnitPrinter 클래스의 조건은 다음과 같다.
    UnitPrinter.printV1() 은 제네릭 메서드로 구현해야 한다.
    UnitPrinter.printV2() 는 와일드카드로 구현해야 한다.
    이 두 메서드는 셔틀에 들어있는 유닛의 정보를 출력한다.
 */

package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.printf("이름: %s, HP: %d\n", unit.getName(),unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t) {
        BioUnit unit = t.out();
        System.out.printf("이름: %s, HP: %d\n", unit.getName(),unit.getHp());
    }
}
