import java.util.*;

public class sortinAlphabetorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] sorting = str.toCharArray();
        Arrays.sort(sorting);
        String s = new String(sorting);
        System.out.println("Sorted string alphabetically\n" + s);
    }
}
