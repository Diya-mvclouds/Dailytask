import java.util.Scanner;

public class methodOverloading {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        methodOverloading m = new methodOverloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an element(2/3/4): ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("Enter 2 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum = " + m.sum(a, b));
        } else if(n==3){
            System.out.println("Enter 3 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Sum = " + m.sum(a, b, c));
        }else if (n == 4){
            System.out.println("Enter 4 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println("Sum = " + m.sum(a, b, c, d));
        }else{
            System.out.println("Invalid");
        }
    }
}