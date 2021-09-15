import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        minMaxSum(arr);
        sc.close();
    }

    public static void minMaxSum(long arr[]) {
        Arrays.sort(arr);

        // FOR MIN SUM
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
        }

        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += arr[i];
        }

        System.out.println(minSum + " " + maxSum);
    }
}