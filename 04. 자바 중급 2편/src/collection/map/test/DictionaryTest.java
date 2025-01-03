/*
문제5 - 영어 사전 만들기
문제 설명
영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전을 만들자.
    먼저 영어 단어와 한글 단어를 사전에 저장하는 단계를 거친다.
    이후에 단어를 검색한다
 */

package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String key = sc.nextLine();
            if (key.equals("q")) break;
            System.out.print("한글 뜻을 입력하세요: ");
            String value = sc.nextLine();

            dictionary.put(key,value);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String key = sc.nextLine();
            if (key.equals("q")) break;
            if (!dictionary.containsKey(key)) System.out.printf("%s은(는) 사전에 없는 단어입니다.\n",key);
            else System.out.printf("%s의 뜻: %s\n", key, dictionary.get(key));
        }
    }
}
