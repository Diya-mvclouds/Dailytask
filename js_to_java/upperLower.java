import java.util.Scanner;

public class upperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String upper = "";
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper+=ch;
            }else{
                lower+=ch;
            }
        }
        System.out.println(upper + lower);
    }
}
