import java.util.HashSet;

class Solution {
    public static void isPairs(int arr[], int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];

            if (set.contains(temp)) {
                System.out.println("Pair with the sum has been founded");
            } else {
                set.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 116;
        isPairs(A, n);
    }
}