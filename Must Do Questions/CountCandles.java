import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        birthdayCakeCandles(arr);
        sc.close();
    }

    public static void birthdayCakeCandles(int arr[]) {
        Arrays.sort(arr);
        int tallCounter = 0;
        int tallest = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tallest) {
                tallCounter++;
            }
        }

        System.out.println(tallCounter);
    }
}