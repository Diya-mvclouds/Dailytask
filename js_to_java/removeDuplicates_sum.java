import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        String num = sc.nextLine();
        String[] n = num.split(" ");
        ArrayList<String> a = new ArrayList<>();
        int sum = 0;
        for (String i : n) {
            if (!a.contains(i)) {
                a.add(i);
                sum += Integer.parseInt(i);
            }
        }
        System.out.println(a);
        System.out.println(sum);
    }
}