package pattern;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime time1 = localDate.atStartOfDay();
        LocalDateTime time2 = localDate.atStartOfDay();

        System.out.println(time1.equals(time2));
    }
}
