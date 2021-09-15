import java.security.AllPermission;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HOUSE
        int s = sc.nextInt();
        int t = sc.nextInt();

        // TREE
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Arrays for Apple and Oranges

        int m = sc.nextInt();
        int n = sc.nextInt();

        int apples[] = new int[m];
        int oranges[] = new int[n];

        // Apples

        for (int i = 0; i < apples.length; i++) {
            apples[i] = sc.nextInt();
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = sc.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int apples[], int oranges[]) {
        for (int i = 0; i < apples.length; i++) {
            apples[i] += a;
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] += b;
        }

        int appleCounter = 0;
        int orangeCounter = 0;

        for (int i = 0; i < apples.length; i++) {
            if (apples[i] >= s && apples[i] <= t) {
                appleCounter++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] >= s && oranges[i] <= t) {
                orangeCounter++;
            }
        }

        System.out.println(appleCounter);
        System.out.println(orangeCounter);

    }
}