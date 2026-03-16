import java.util.*;

public class sortinAlphabetorder {
    public static void main(String[] args) {
        String str = "good day";
        System.out.println("Original string\n" + str);
        char[] sorting = str.toCharArray();
        Arrays.sort(sorting);
        String s = new String(sorting);
        System.out.println("Sorted string alphabetically\n" + s);
    }
}
