import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();

        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            for (int j = 1; j < Integer.MAX_VALUE; j++) {
                x1 = x1 + v1;
                x2 = x2 + v2;
                if (x1 == x2) {

                    System.out.println("YES");
                    break;
                }

            }

        }
    }
}