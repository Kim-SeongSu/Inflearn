package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addvalue) {
        int result = value + addvalue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
