package array;

/*
문제 - 2차원 배열2
이전 문제에서 학생수를 입력받도록 개선하자.
실행 결과 예시를 참고하자.
 */

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int n = sc.nextInt();

        int[][] score = new int[n][3];
        String[] subject = new String[] {"국어", "영어", "수학"};

        for (int row=0; row<n; row++) {
            System.out.printf("%d번 학생의 성적을 입력하세요:\n", row+1);
            for (int col = 0; col < 3; col++) {
                System.out.printf("%s 점수:", subject[col]);
                score[row][col] = sc.nextInt();
            }
        }

        for (int i=0; i< score.length; i++){
            int total = 0;
            for (int x : score[i]) {
                total += x;
            }

            double avg = (double) total / 3;

            System.out.printf("%d번 학생의 총점: %d, 평균: %.1f\n", i+1,total, avg);
        }
    }
}
