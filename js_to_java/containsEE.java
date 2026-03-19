import java.util.Scanner;

public class containsEE {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Sentence: ");
       String str = sc.nextLine();
       boolean s = str.contains("ee");
       System.out.println(s);
    }
}
