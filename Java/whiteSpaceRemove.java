
import java.util.Scanner;

public class whiteSpaceRemove {
    public static void main(String[] args) {
        // String str = "welcome to MV Clouds"
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' '){
                result = result + str.charAt(i);
            }
        }
        System.out.println("After removing White Space: " + result);
        sc.close();
    }
}
