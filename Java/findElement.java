import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String[] s = str.split("");
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < s.length; i++) {
            if (str.charAt(i) == ch) {
                System.out.print(i + " ");
            }     
        }
    }
}