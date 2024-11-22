package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        // NestedOuter outer = new NestedOuter(); // 생략가능
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
