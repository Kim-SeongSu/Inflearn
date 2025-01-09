package hello.core;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter //  getter 관련 자동으로 만들어줌
@Setter // setter "
@ToString   // tostring "
@RequiredArgsConstructor    // 생성자 "
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("test");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
