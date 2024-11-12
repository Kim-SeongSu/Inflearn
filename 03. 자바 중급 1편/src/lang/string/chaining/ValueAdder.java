package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; // 자기 자신의 참조값을 반환 (=StringBuilder가 사용하는 기법이 바로 메서드 체이닝 기법)
    }

    public int getValue() {
        return value;
    }
}
