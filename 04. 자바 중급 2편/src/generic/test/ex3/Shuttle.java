/*
문제와 풀이2 - 제네릭 타입과 상한
문제 설명
    다음 코드와 실행 결과를 참고해서 Shuttle 클래스를 만들어라.
    Shuttle 클래스의 조건은 다음과 같다.
    제네릭 타입을 사용해야 한다.
    showInfo() 메서드를 통해 탑승한 유닛의 정보를 출력한다.
 */

package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit>{
    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.printf("이름: %s, HP: %d\n", unit.getName(),unit.getHp());
    }
}
