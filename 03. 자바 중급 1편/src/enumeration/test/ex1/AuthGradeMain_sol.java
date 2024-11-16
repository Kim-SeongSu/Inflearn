/*
문제1 - 인증 등급 만들기
문제 설명
패키지의 위치는 enumeration.test 를 사용하자.
회원의 인증 등급을 AuthGrade 라는 이름의 열거형으로 만들어라.
인증 등급은 다음 3가지이고, 인증 등급에 따른 레벨과 설명을 가진다. 레벨과 설명을 getXxx() 메서드로 조회할 수 있어야 한다.
    GUEST(손님)
        level=1
        description=손님
    LOGIN(로그인 회원)
        level=2
        description=로그인 회원
    ADMIN(관리자)
        level=3
        description=관리자
 */

package enumeration.test.ex1;

public class AuthGradeMain_sol {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" + value.getLevel() + ", 설명=" + value.getDescription());
        }

    }
}
