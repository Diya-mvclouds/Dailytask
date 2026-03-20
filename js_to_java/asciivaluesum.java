import java.util.Scanner;

public class asciivaluesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int sum = 0;
        for (char ch : str.toCharArray()) {
            int a = ch;
            System.out.println(ch + " " + a);
            sum += a;
        }
        System.out.println("Total Sum: " + sum);
    }
}