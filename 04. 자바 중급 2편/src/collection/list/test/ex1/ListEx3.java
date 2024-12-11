/*
문제3 - 합계와 평균
    사용자에게 n 개의 정수를 입력받아서 List 에 보관하고, 보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
 */

package collection.list.test.ex1;

import java.util.LinkedList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true) {
            int n = sc.nextInt();
            if (n==0) break;
            list.add(n);
        }

        int sum = calSum(list);
        /*
        for (Integer number : list) {
            sum += number;
        }

         */
        double avg = (double) sum / list.size();

        System.out.printf("입력한 정수의 합계: %d\n", sum);
        System.out.printf("입력한 정수의 평균: %.1f\n", avg);
    }

    private static int calSum(LinkedList list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) sum += (Integer) list.get(i);
        return sum;
    }
}
