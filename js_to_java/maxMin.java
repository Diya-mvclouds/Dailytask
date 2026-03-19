import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String arr[] = n.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (String arr1 : arr) {
            int num = Integer.parseInt(arr1);
            if (num > max) {
                max = num;
            }
            if (num < max){
                min = num;
            }
        }
        System.out.println(max + " " + min);
    }
}
