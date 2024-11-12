/*
문제9 - split()
문제 설명
split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
 */

package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] temp = email.split("@");
        System.out.printf("ID: %s\n",temp[0]);
        System.out.printf("Domain: %s\n",temp[1]);
    }
}
