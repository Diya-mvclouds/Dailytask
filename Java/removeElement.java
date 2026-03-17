import java.util.Scanner;

public class removeElement {
    static void remove(int arr[], int n, Scanner sc){
        int r = 0;
        System.out.println("Enter an elements in array: ");
        for (int i = 0; i <= 2*n; i++) {
            if(i < n){
                arr[i] = sc.nextInt();
            }
            else if(i == n){
                System.out.println("Enter a number to remove: ");
                r = sc.nextInt();
                System.out.println("After remove: ");
            }
            else{
                if(arr[i-(n+1)] != r){
                    System.out.print(arr[i-(n+1)] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        remove(arr, n, sc);
    }
}