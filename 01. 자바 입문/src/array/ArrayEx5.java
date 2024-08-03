package array;

/*
문제 - 합계와 평균2
이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
실행 결과 예시를 참고하자
 */

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();

        System.out.printf("%d개의 정수를 입력하세요:", n);
        int[] arr = new int[n];
        int total = 0;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        double avg = (double) total / n;

        System.out.printf("입력한 정수의 합계: %d\n", total);
        System.out.printf("입력한 정수의 평균: %.1f", avg);
    }
}
