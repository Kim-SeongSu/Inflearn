/*
문제: 이전 문제에 배열을 사용하자
이전 문제에 배열을 적용하자. 그래서 학생이 추가되어도 코드 변경을 최소화 해보자.
 */

package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i=0; i< studentGrade.length; i++) {
            System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrade[i]);
        }
    }
}
