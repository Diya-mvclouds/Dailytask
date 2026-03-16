import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to remove: ");
        int remove = sc.nextInt();
        System.out.println("After remove: ");
        for (int i = 0; i < n; i++) {
            if(arr[i] != remove){
                System.out.print(arr[i] + " ");
            }
        }
    }
}