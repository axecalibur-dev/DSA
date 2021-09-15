import java.util.*;

class Solution {

    public static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
        sc.close();
    }
}