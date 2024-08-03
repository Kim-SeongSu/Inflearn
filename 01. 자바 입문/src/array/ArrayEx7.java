package array;

/*
문제 - 2차원 배열1
사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 */

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subject = new String[] {"국어", "영어", "수학"};

        for (int row=0; row<4; row++) {
            System.out.printf("%d번 학생의 성적을 입력하세요:\n", row+1);
            for (int col = 0; col < 3; col++) {
//                if (col == 0) {
//                    System.out.print("국어 점수:");
//                } else if (col == 1) {
//                    System.out.print("영어 점수:");
//                } else {
//                    System.out.print("수학 점수:");
//                }

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
