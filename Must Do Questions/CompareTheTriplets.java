import java.util.*;

class Solution {

    public static void compareTriplets(int alice[], int bob[]) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                aliceSum++;
            } else if (alice[i] < bob[i]) {
                bobSum++;
            }

            else if (alice[i] == bob[i]) {
                continue;
            }
        }

        int response[] = new int[2];
        response[0] = aliceSum;
        response[1] = bobSum;
        for (int i = 0; i < response.length; i++) {
            System.out.print(response[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alice[] = new int[3];
        int bob[] = new int[3];
        for (int i = 0; i < alice.length; i++) {
            alice[i] = sc.nextInt();
        }
        for (int i = 0; i < bob.length; i++) {
            bob[i] = sc.nextInt();
        }

        compareTriplets(alice, bob);
        sc.close();

    }
}