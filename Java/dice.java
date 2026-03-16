import java.util.Scanner;

public class dice {
    static int count(int dice, int sum){
        if (dice == 0 && sum == 0){
            return 1;
        }
        if (dice == 0 || sum <= 0){
            return 0;
        }
        int ways = 0;
        for (int i = 1; i <= 6; i++) {
            ways += count(dice - 1, sum - i);
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of dice: ");
        int dice = sc.nextInt();
        System.out.println("Enter target sum: ");
        int sum = sc.nextInt();

        int result = count(dice, sum);
        System.out.println("Output :\n" + result);
    }
}
