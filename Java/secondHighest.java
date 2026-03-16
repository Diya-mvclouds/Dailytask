public class secondHighest {
    public static void main(String[] args) {
        int[] arr = {98,32,72,94,75,73,92,36,28,34};
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > highest){
                secondhighest = highest;
                highest = n;
            }
            else if (n > secondhighest && n != highest){
                secondhighest = n;
            }
        }
        System.out.println(secondhighest);
    }
}
