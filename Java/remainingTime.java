import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class remainingTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting date (YYYY-MM-DD): ");
        LocalDate start = LocalDate.parse(sc.next());
        System.out.println("Enter ending date (YYYY-MM-DD): ");
        LocalDate end = LocalDate.parse(sc.next());

        long days = ChronoUnit.DAYS.between(start, end);
        long seconds = days * 24 * 60 * 60;

        while (seconds >= 0) {
            long d = seconds / (24 * 3600);
            long h = (seconds % (24 * 3600)) / 3600;
            long m = (seconds % 3600) / 60;
            long s = seconds % 60;

            System.out.println(d + " Days " + h + " Hours " + m + " Minutes " + s + " Seconds");
            seconds--;
        }
    }
}