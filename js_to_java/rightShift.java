
import java.util.Scanner;

public class rightShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a shift number: ");
        int shift = sc.nextInt();
        System.out.println(Math.floor(n/Math.pow(2, shift)));
    }
}
