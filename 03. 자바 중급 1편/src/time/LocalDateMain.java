package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1997, 1,24);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 모든 날짜 클래스는 불변이므로 새로운 객체를 생성해 반환값을 꼭 받아야한다.
        LocalDate plusDays = ofDate.plusDays(10000);
        System.out.println("지정 날짜+10d = " + plusDays);
    }
}
