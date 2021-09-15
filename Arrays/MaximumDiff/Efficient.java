class Solution {
    public static int maxDiff(int arr[]) {
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for (int j = 1; j < arr.length; j++) {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 18, 10, 1 };

        int res = maxDiff(arr);
        System.out.println(res);
    }
}