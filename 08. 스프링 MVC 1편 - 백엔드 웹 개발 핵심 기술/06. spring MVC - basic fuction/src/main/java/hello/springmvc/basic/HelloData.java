package hello.springmvc.basic;

import lombok.Data;

@Data // lombok의 기능으로, @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용해 줌
public class HelloData {
    private String username;
    private int age;
}


