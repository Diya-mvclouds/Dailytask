import java.util.*;

public class checkOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers of elements");
        int n = sc.nextInt();
        boolean odd = true;
        System.out.println("Enter a numbers in list: ");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if (num % 2 == 0){
                odd = false;
            }
        }
        if(odd){
            System.out.println("List contains odd numbers only");
        }
        else{
            System.out.println("List contains even numbers");
        }
        sc.close();
    }
}