/*
문제7 - 공백 제거
문제 설명
문자의 양쪽 공백을 제거해라.
 */

package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = " Hello Java ";
        System.out.println(original.strip());
        System.out.println(original.trim());
    }
}
