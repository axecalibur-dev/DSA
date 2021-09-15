import java.text.DecimalFormat;
import java.util.*;

class Solution {

    public static void plusMinus(int arr[]) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            } else if (arr[i] == 0) {
                zeroCount++;
            }
        }

        System.out.printf("%.6f %n", (double) posCount / n);
        System.out.printf("%.6f %n", (double) negCount / n);
        System.out.printf("%.6f %n", (double) zeroCount / n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Length of array
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        plusMinus(arr);
        sc.close();

    }

}