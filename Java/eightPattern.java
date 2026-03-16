public class eightPattern {
    public static void main(String[] args) {
        int n = 9;
        int width = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < width; j++){
                if ((i == 0 || i == n / 2 || i == n - 1) && (j != width - 1 && j != 0)) {
                    System.out.print("*");
                }else if ((j == 0 || j == width - 1) && (i > 0 && i < n /2 || i > n / 2 && i < n - 1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
