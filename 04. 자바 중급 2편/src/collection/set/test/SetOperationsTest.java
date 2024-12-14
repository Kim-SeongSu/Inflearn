/*
문제4 - 합집합, 교집합, 차집합
문제 설명
    두 숫자의 집합이 제공된다.
        집합1: 1, 2, 3, 4, 5
        집합2: 3, 4, 5, 6, 7
두 집합의 합집합, 교집합, 차집합을 구해라. 출력 순서는 관계없다.
        합집합: 두 집합의 합이다. 참고로 중복은 제거한다. [1, 2, 3, 4, 5, 6, 7]
        교집합: 두 집합의 공통 값이다. 참고로 중복은 제거한다. [3, 4, 5]
        차집합: 집합1에서 집합2와 같은 값을 뺀 나머지 [1, 2]
*/

package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.printf("합집합: %s\n",union);

        // 교집합
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.printf("교집합: %s\n",intersection);

        // 차집합
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.printf("차집합: %s\n",difference);
    }
}
