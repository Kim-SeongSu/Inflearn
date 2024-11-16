/*
문제2 - 인증 등급 열거형 조회하기
문제 설명
    AuthGradeMain1 이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.
    앞서 만든 AuthGrade 을 활용하자
 */

package enumeration.test.ex1;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();

        for (AuthGrade value : values) {
            printInfo(value);
        }

    }

    private static void printInfo (AuthGrade authGrade) {
        System.out.printf("인증 등급 = %s\n",authGrade.name());
        System.out.printf("\tlevel = %s",authGrade.getLevel());
        System.out.printf("\tdescroption = %s",authGrade.getDescription());
        System.out.println();
    }
}
