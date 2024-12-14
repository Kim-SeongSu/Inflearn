/*
문제2 - 중복 제거와 입력 순서 유지
문제 설명
    여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
    30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
    단 입력 순서대로 출력해라.
        출력 예): 30, 20, 10
 */

package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        /*
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // Set<Integer> set = new LinkedHashSet<>(); 답안


        for (Integer x : inputArr) {
            set.add(x);
        }
         */

        // 배열채로 입력받는 방법
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));


        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
