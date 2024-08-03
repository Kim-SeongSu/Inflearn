package array;

/*
문제 - 가장 작은 수, 큰 수 찾기
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
그램을 작성하자. 실행 결과 예시를 참고하자.
 */

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();

        System.out.printf("%d개의 정수를 입력하세요:", n);
        int[] arr = new int[n];
        int minN = 9999, maxN = 0;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if (minN > arr[i]){
                minN = arr[i];
            }
            if (maxN < arr[i]){
                maxN = arr[i];
            }
        }
        System.out.printf("가장 작은 정수: %d\n", minN);
        System.out.printf("가장 큰 정수: %d", maxN);
    }
}
