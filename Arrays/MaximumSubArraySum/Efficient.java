class Solution {
    public static int maxSum(int arr[]) {
        int res = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax + arr[i], arr[i]);
            res = Math.max(currentMax, res);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 2 };

        System.out.println(maxSum(arr));
    }
}