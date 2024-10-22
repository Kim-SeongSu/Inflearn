package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 변수 선언
        Student student1;

        // 객체 생성
        student1 = new Student();

        // 참조값 보관
        /*
        new 키워드를 통해 객체가 생성되면 참조값을 반환함
        반환된 참조값을 앞서 선언한 변수 Student student1에 보관함
        >> student1 = x001;  Student 인스턴스 참조값 보관
        */

        // 객체 값 대입
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 객체 값 사용
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
