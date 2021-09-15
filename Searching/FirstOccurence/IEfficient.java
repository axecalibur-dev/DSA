class Solution {
    public static int iterativeFirstOccurence(int arr[], int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            }

            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;

                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 20, 30, 40 };
        int x = 20;
        int res = iterativeFirstOccurence(arr, 0, arr.length - 1, x);
        System.out.println(res);
    }
}