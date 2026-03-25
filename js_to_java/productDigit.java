import java.util.Scanner;

public class productDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        System.out.println("Sum: " + sum);
        System.out.print("products: ");
        while(sum >= 10){
            int product = 1;
            while(sum > 0){
                product *= sum % 10;
                sum /= 10;
            }
            sum = product;
            System.out.print(product + " ");
        }
        System.out.println("\nFinal output: " + sum);
    }
}
