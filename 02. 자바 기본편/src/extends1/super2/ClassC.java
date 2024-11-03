package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10,20); // 기본 생성자인 경우에만 생략 가능
        System.out.println("ClassC 생성자");
    }
}
