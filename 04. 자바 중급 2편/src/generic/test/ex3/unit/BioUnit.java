/*
준비
    여러분은 게임속 케릭터를 클래스로 만들어야 한다.
    BioUnit 은 유닛들의 부모 클래스이다.
    BioUnit 의 자식 클래스로 Marine , Zealot , Zergling 이 있다.
    문제를 풀기 전에 우선 다음 코드를 완성하자.
 */

package generic.test.ex3.unit;

public class BioUnit {
    private String name;
    private int hp;

    public BioUnit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
