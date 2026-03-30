import java.util.ArrayList;
import java.util.Scanner;

public class rotateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter an elements in array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr);

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        int oddsum = 0;
        int evensum = 0;
        for (int i = n - 1; i >= 0; i--) {
            int a = arr.get(i);
            if (a % 2 == 0) {
                even.add(a + 1);
                evensum = evensum + a;
            } 
            else {
                odd.add(a + 1);
                oddsum = oddsum + a;
                
            }
        }
        r.addAll(odd);
        r.addAll(even);
        System.out.println(r);
        System.out.println("Odd number sum: "+ oddsum);
        System.out.println("Even number sum: " + evensum);
        if (oddsum > 10) {
            System.out.println("Output1");
        } 
        if (evensum > 10) {
            System.out.println("Output2");
        }
    }
}