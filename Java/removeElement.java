import java.util.*;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter an elements in array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter a number to remove: ");
        int r = sc.nextInt();
        arr.remove(Integer.valueOf(r));
        System.out.println(arr);
    }
}