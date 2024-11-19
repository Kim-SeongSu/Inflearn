package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime noOdt = OffsetDateTime.now();
        System.out.println("noOdt = " + noOdt);

        LocalDateTime ldt = LocalDateTime.of(2024,1,24,0,0,1);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);

        OffsetDateTime odt1 = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00:07"));
        System.out.println("odt1 = " + odt1);
    }
}
