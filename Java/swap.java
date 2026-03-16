import java.util.Scanner;

class swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for swap: ");
        System.out.print(" X = ");
        int x = sc.nextInt();
        System.out.print(" Y = ");
        int y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap \n X = " + x + "\n Y = " + y);
        sc.close();
    }
}