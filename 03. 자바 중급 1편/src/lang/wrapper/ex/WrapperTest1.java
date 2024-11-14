/*
문제1 - parseInt()
문제 설명
    문자로 입력된 str1 , str2 두 수의 합을 구하자.
 */

package lang.wrapper.ex;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        int sum = n1 + n2;
        System.out.println("두 수의 합: " + sum);
    }
}
