import java.util.Scanner;

public class removeLeadingTrailing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.nextLine();
        int start = 0;
        int end = n.length() - 1;
        while (start < end && n.charAt(start) == '0') {
            start++;
        }
        if (n.contains(".")) {
            while (end > start && n.charAt(end) == '0') {
                end--;
            }
            if (n.charAt(end) == '.') {
                end--;
            }
        }
        System.out.println(n.substring(start, end + 1));

    }
}