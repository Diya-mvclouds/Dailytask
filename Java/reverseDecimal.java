import java.util.*;

public class reverseDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        sb.reverse();
        System.out.println("Reversed: " + sb);
        sc.close();
    }
}