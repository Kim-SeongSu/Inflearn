/*
문제5 - 국제 회의 시간
서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라.
 */

package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 9, 0, 0, 0), ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간: " + seoul);

        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던의 회의 시간:  " + london);
        
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의 시간: " + newYork);
    }
}
