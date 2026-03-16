
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int i = num;
       int sum = 0;
       int count = String.valueOf(num).length();

       while (num > 0){
        int digit = num % 10;
        sum += Math.pow(digit, count);
        num = num / 10;
       }

        if (sum == i) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

    }
}
