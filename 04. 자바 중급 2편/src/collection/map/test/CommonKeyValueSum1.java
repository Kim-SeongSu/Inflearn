/*
문제2 - 공통의 합
문제 설명
map1 과 map2 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
실행 결과를 참고하자.
 */

package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        /*
        // 생성과 동시에 초기화 (단, Map.of를 사용하여 생성한 Map은 불변이라 내용 변경 불가)
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
         */


        // 코드 작성
        Map<String, Integer> map3 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (map1.containsKey(entry.getKey())) {
                map3.put(entry.getKey(), map1.get(entry.getKey()) + entry.getValue());
            }
        }
        /*
        // 답안
        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
         */

        System.out.println(map3);
    }
}
