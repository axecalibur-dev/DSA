class Solution {
    public static boolean sorted(int arr[], int n) {
        if (n == 1 || n == 0) {
            return true;
        } else if (arr[n - 1] < arr[n - 2]) {
            return false;
        }

        return sorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 44, 111, , 5555 };
        boolean res = sorted(arr, arr.length);
        System.out.println(res);
    }
}