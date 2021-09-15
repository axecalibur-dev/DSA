class Solution {
    public static int maxSum(int arr[]) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                current = current + arr[j];
                res = Math.max(res, current);
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 3, -1, 2 }, n = 5;

        System.out.println(maxSum(arr));

    }

}