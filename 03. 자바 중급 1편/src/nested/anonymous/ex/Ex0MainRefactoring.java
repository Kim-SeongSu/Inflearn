package nested.anonymous.ex;

public class Ex0MainRefactoring {
    public static void hello(String programName) {
        System.out.println("프로그램 시작");
        System.out.printf("Hello %s\n", programName);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
