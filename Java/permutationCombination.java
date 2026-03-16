
import java.util.Scanner;

// Permutation = !n / !(n-r)
// Combination = !n / (!r * !(n-r))

public class permutationCombination {

    static int factorial(int n){
        int i = 1, fact =1;
         while(i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        int com, per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number: ");
        int n = sc.nextInt();
        System.out.println("Enter Select number: " );
        int r = sc.nextInt();
        per = factorial(n) / factorial(n-r);
        com = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("Permutation of "+ n + " & " + r + " is "+ per);
        System.out.println("Combination of "+ n + " & " + r + " is " + com);
    }
}
