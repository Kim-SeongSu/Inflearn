package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 (오버로딩 실습)
    /*
    MemberConstruct(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 50;
    }
     */
    MemberConstruct(String name, int age){
        // 첫번째 생성자 내무에서 두번째 생성자를 호출
        this(name,age,50);
    }


    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
