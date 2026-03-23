import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class lunchTime {
    public static void main(String[] args) {
        LocalTime lunch = LocalTime.of(13, 0);
        LocalTime now = LocalTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Current time: " + now.format(fmt));
        System.out.println("Lunch time: " + lunch.format(fmt));

        if (now.isAfter(lunch)) {
            System.out.println("Lunch time is already passed...!!");
        } 
        else {
            long hours = ChronoUnit.HOURS.between(now, lunch);
            long min = ChronoUnit.MINUTES.between(now, lunch);
            long sec = ChronoUnit.SECONDS.between(now, lunch);
            long m = min % 60;
            long s = sec % 60;

            System.out.printf("Remaining time: %02d:%02d:%02d", hours, m, s);
        }
    }
}
