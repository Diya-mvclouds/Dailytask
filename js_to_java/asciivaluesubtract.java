import java.util.Scanner;

public class asciivaluesubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int a = 0;
        int b = 128;
        for(char ch : str.toCharArray()) {
            int c = ch;
            a-= c;
            System.out.println(ch + " " + c);
            if(c<b){
                b = c;
            }
        }
        System.out.println("Smallest ASCII value: " + b);
        System.out.println("Subtraction of values: " + a);
    }
}