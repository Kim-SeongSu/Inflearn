/*
문제3 - 인증 등급 열거형 활용하기
문제 설명
    AuthGradeMain2 클래스에 코드를 작성하자.
    인증 등급을 입력 받아서 앞서 만든 AuthGrade 열거형으로 변환하자.
    인증 등급에 따라 접근할 수 있는 화면이 다르다.
        예를 들어 GUEST 등급은 메인 화면만 접근할 수 있고, ADMIN 등급은 모든 화면에 접근할 수 있다.
        각각의 등급에 따라서 출력되는 메뉴 목록이 달라진다.
    다음 출력 결과를 참고해서 코드를 완성하자.
 */

package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.printf("당신의 등급은 %s입니다.\n", authGrade.getDescription());

        showMenu(authGrade);
    }

    private static void showMenu (AuthGrade authGrade) {
        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) System.out.println("- 메인 화면");
        if (authGrade.getLevel() > 1) System.out.println("- 이메일 관리 화면");
        if (authGrade.getLevel() > 2) System.out.println("- 관리자 화면");
    }
}
