import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class remainingDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a future date(YYYY-MM-DD): ");
        LocalDate future = LocalDate.parse(sc.nextLine());
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(today, future);
        System.out.println("Remaining days are " + days);
    }
}