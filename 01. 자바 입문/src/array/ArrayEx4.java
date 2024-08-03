package array;

/*
문제 - 합계와 평균
사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
 */

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.printf("5개의 정수를 입력하세요: ");
        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        int total = 0;
        for (int i : arr) {
            total += i;
        }

        double avg = (double) total / 5;

        System.out.printf("입력한 정수의 합계: %d\n", total);
        System.out.printf("입력한 정수의 평균: %.1f", avg);
    }
}
