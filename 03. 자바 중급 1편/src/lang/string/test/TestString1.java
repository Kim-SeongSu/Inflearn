/*
문제1 - startsWith
문제 설명
    startsWith() 를 사용해서 url 이 https:// 로 시작하는지 확인해라
 */

package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        System.out.println(url.startsWith("https://"));
    }
}
