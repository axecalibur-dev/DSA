class Solution {
    public static int search(int arr[], int x) {

        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
        }

        if (arr[i] == x) {
            return i;
        }

        return binarySearch(arr, (i / 2) + 1, i - 1, x);
    }

    public static int binarySearch(int arr[], int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 40, 50 };

        int x = 3;

        int res = search(arr, x);
        System.out.println(res);
    }
}