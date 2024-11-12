/*
문제2 - length()
문제 설명
length() 를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.
 */

package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String s : arr) {
            int x = s.length();
            System.out.printf("%s:%d\n",s,x);
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}
