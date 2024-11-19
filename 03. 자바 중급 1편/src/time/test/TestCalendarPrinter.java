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

        PrintCalendar(year, month);
    }

    private static void PrintCalendar (int year, int month) {
        System.out.println("Su Mo Tu We Th Fr Sa");

        LocalDate firstDay = LocalDate.of(year, month, 1);
        LocalDate lastDay = LocalDate.of(year, month, firstDay.lengthOfMonth());

        // 첫째주 월요일 전까지 빈칸 생성
        int offsetFirstDay = firstDay.getDayOfWeek().getValue() % 7;
        for (int i=0; i < offsetFirstDay; i++) {
            System.out.print("   ");
        }

        LocalDate currentDay = firstDay;
        while (!currentDay.equals(lastDay.plusDays(1))) {
            System.out.printf("%2d ",currentDay.getDayOfMonth());
            if (currentDay.getDayOfWeek() == DayOfWeek.SATURDAY) System.out.println();
            currentDay = currentDay.plusDays(1);
        }
    }
}

/*
# 정답
package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월요일=1(1%7=1), ... 일요일=7(7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print(" ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
 */