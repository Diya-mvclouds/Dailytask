import java.util.Scanner;

public class compareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an Array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter an elements in Array 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter a size of an Array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter an elements in Array 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("\nElements not in Array 1: ");
        for (int i = 0; i < n2; i++) {
            boolean diff = false;
            for (int j = 0; j < n1; j++) {
                if(arr2[i] == arr1[j]){
                    diff = true;
                }
            }
            if(!diff){
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.print("\nElements not in Array 2: ");
        for (int i = 0; i < n1; i++) {
            boolean diff = false;
            for (int j = 0; j < n2; j++) {
                if(arr1[i] == arr2[j]){
                    diff = true;
                }
            }
            if(!diff){
                System.out.print(arr1[i] + " ");
            }
        }
    }
}