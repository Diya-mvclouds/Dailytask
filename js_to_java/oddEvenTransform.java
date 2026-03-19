import java.util.Scanner;

public class oddEvenTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String s = "";
        for (char ch : str.toCharArray()) {
            if (ch % 2 == 0) {
                s += Character.toUpperCase(ch); 
            } 
            else {
                s += Character.toLowerCase(ch);
            }
        }
        System.out.println(s);
    }
}
