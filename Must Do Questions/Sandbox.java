import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Home Coords Start
        int t = sc.nextInt(); // Home Coords End
        int a = sc.nextInt(); // Apple Tree location
        int b = sc.nextInt(); // Orange Tree Location
        int m = sc.nextInt(); // Apple #s
        int n = sc.nextInt(); // Orange #s
        int apples[] = new int[m];
        int oranges[] = new int[n];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = sc.nextInt();
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = sc.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int apples[], int oranges[]) {
        ArrayList<Integer> holdings = new ArrayList<>();
        for (int i = 0; i < apples.length; i++) {
            int appleValue = apples[i] + a;
            holdings.add(appleValue);
        }

        for (int i = 0; i < oranges.length; i++) {
            int orangeValue = oranges[i] + b;
            holdings.add(orangeValue);
        }
    }
}