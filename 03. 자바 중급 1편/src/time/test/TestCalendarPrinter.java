/*
문제6 - 달력 출력하기
    실행 결과를 참고해서 달력을 출력해라.
    입력 조건: 년도, 월
    실행시 날짜의 간격에는 신경을 쓰지 않아도 된다. 간격을 맞추는 부분은 정답을 참고하자
 */

package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        System.out.println("Su Mo Tu We Th Fr Sa");

        LocalDate firstDay = LocalDate.of(year, month, 1);
        DayOfWeek weekOfFirstDay = firstDay.getDayOfWeek();

        System.out.println(weekOfFirstDay);

    }
}
