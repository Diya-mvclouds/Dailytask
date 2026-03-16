
import java.util.Scanner;

public class findWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence");
        String sent = sc.nextLine();
        System.out.println("Check word");
        String word = sc.nextLine();

        if (sent.contains(word)){
            System.out.println("Word found");
        }
        else{
            System.out.println("Word not found");
        }
        sc.close();
    }
}
