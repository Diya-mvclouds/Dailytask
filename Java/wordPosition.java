import java.util.Scanner;

public class wordPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence ");
        String sent = sc.nextLine();
        System.out.println("Tell a number to see position");
        int n = sc.nextInt();
        String[] word = sent.split(" ");

        if (n > 0 && n <= word.length){
            System.out.println(word[n-1]);
        }
        else{
            System.out.println("Invalid position");
        }
    }
}
