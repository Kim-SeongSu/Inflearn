package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        // 새로 생성된 반환 값을 사용하지 않으면?
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
    }
}
