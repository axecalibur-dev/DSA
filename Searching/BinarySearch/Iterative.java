class Solution {
    public static int iterativeBinarySearch(int arr[], int low, int high, int x) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (x < arr[mid]) {
                high = mid - 1;
            }

            else if (x > arr[mid]) {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int x = 5;
        int res = iterativeBinarySearch(arr, 0, arr.length - 1, x);
        System.out.println(res);
    }

}