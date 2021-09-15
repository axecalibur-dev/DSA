class Solution {
    public static int iterativeLastOccurence(int arr[], int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                return low = mid + 1;
            }

            else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 20, 30, 40 };
        int x = 20;
        int res = iterativeLastOccurence(arr, 0, arr.length - 1, x);
        System.out.println(res);
    }
}