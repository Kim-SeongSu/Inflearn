/*
문제3 - 같은 단어가 나타난 수
문제 설명
각각의 단어가 나타난 수를 출력해라.
실행 결과를 참고하자.
 */

package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        Map<String, Integer> fruits = new HashMap<>();
        for (String str : text.split(" ")) {
            if (fruits.get(str) == null) fruits.put(str, 1);
            else fruits.put(str,fruits.get(str)+1);
        }

        System.out.println(fruits);
    }
}

/*
// 정답 1
public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";

    Map<String, Integer> map = new HashMap<>();

    String[] words = text.split(" ");

    for (String word : words) {
        Integer count = map.get(word);
        if (count == null) count = 0;
        count++;

        map.put(word, count);
    }
    System.out.println(map);
}



// 정답 2
public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";

    Map<String, Integer> map = new HashMap<>();

    String[] words = text.split(" ");

    for (String word : words) {
        map.put(word, map.getOrDefault(word,0) +1);
    }
    System.out.println(map);
}
 */
