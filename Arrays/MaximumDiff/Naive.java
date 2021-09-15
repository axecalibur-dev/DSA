class Solution {
    public static int maxDiff(int arr[]) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8, 10, 1 };

        int res = maxDiff(arr);
        System.out.println(res);
    }
}