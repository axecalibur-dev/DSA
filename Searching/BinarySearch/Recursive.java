class Solution {
    public static int recursiveBinarySearch(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        }

        if (x < arr[mid]) {
            return recursiveBinarySearch(arr, low, mid - 1, x);
        } else if (x > arr[mid]) {
            return recursiveBinarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5 };
        int x = 15;
        int res = recursiveBinarySearch(arr, 0, arr.length - 1, x);
        System.out.println(res);
    }
}