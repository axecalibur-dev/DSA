class Solution {
    public static int maxSum(int arr[]) {
        int res = arr[0];
        int maxEndingSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingSum = Math.max(maxEndingSum + arr[i], arr[i]);
            res = Math.max(maxEndingSum, res);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 2 };
        int res = maxSum(arr);
        System.out.println(res);
    }
}