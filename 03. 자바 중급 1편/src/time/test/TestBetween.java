/*
문제3 - 디데이 구하기
문제 설명
    시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라. 실행 결과를 참고하자.
    남은 기간: x년 x개월 x일 형식으로 출력한다.
    디데이: x일 남은 형식으로 출력한다.
 */

package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);


        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);

        Period between = Period.between(startDate, endDate);
        System.out.printf("남은 기간: %d년 %d개월 %d일\n", between.getYears(), between.getMonths(), between.getDays());
        System.out.printf("디데이: %d일 남음\n",ChronoUnit.DAYS.between(startDate,endDate));
    }
}