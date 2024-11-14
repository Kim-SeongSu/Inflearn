/*
문제4 - 오토 박싱, 오토 언박싱
문제 설명
    String str 을 Integer 로 변환해서 출력해라.
    Integer 를 int 로 변환해서 출력해라.
    int 를 Integer 로 변환해서 출력해라.
    오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.
 */

package lang.wrapper.ex;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);

        //Integer -> int
        int intValue = integer1;

        //int -> Integer
        Integer integer2 = intValue;


        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
