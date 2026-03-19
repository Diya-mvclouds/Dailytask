import java.util.Scanner;

public class afterSwapHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two-digit number: ");
        int n = sc.nextInt();
        int x = n / 10;
        int y = n % 10;
        int swap = y * 10 + x;
        if (n > swap) {
            System.out.println("true");
        }
        else if (n == swap) {
            System.out.println("Same numbers");
        } 
        else {
            System.out.println("false");
        }
    }
}
