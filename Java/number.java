public class number {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}