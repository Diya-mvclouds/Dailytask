import java.util.Scanner;

public class fourthHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers to an array: ");
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int lowest = Integer.MAX_VALUE;
        int secondlowest = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a < lowest) {
                secondlowest = lowest;
                lowest = a;
            }else if(a < secondlowest && a != lowest){
                secondlowest = a;
            }
        }
        System.out.println(secondlowest);
    }
}