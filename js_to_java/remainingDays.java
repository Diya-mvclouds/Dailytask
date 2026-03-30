import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class remainingDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Date(YYYY-MM-DD): ");
        LocalDate now = LocalDate.now();
        LocalDate future = LocalDate.parse(sc.nextLine());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        System.out.println("Current Date: " + now.format(fmt));
        System.out.println("Future Date: " + future.format(fmt));
        if (now.isAfter(future)) {
            System.out.println("Time is already passed...!!!");
        }
        else{
            Period diff = Period.between(now, future);
            System.out.println("Remaining time: ");
            System.out.println(diff.getYears() + " Years " + diff.getMonths() + " Months " + diff.getDays() + " Days");
        }
    }
}