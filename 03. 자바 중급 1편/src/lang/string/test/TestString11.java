/*
문제11 - reverse()
문제 설명
str 문자열을 반대로 뒤집어라.
StringBuilder 에 있는 reverse() 를 사용해라.
 */

package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String sb = new StringBuilder(str).reverse().toString();
        System.out.println(sb);
    }
}
