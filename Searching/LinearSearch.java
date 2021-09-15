class Solution {
    public static int binarySearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 1, 22, 3, 91 };
        int x = 22;
        int res = binarySearch(arr, x);
        System.out.println(res);
    }
}