class Solution {
    public static int recursiveFirstOccurence(int arr[], int low, int high, int x) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (x < arr[mid]) {
            return recursiveFirstOccurence(arr, low, mid - 1, x);
        } else if (x > arr[mid]) {
            return recursiveFirstOccurence(arr, mid + 1, high, x);
        }

        else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                return recursiveFirstOccurence(arr, low, mid - 1, x);
            }
        }

    }

    public static int recursiveLastOccurence(int arr[], int low, int high, int x) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (x < arr[mid]) {
            return recursiveLastOccurence(arr, low, mid - 1, x);
        } else if (x > arr[mid]) {
            return recursiveLastOccurence(arr, mid + 1, high, x);
        }

        else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return recursiveLastOccurence(arr, mid + 1, high, x);
            }
        }
    }

    public static int countOccurences(int arr[], int low, int high, int x) {
        int first = recursiveFirstOccurence(arr, low, high, x);

        if (first == -1) {
            return 0;
        }

        else {
            return (recursiveLastOccurence(arr, low, high, x) - first + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 20, 20, 30, 40 };
        int x = 20;
        int res = countOccurences(arr, 0, arr.length - 1, x);
        System.out.println(res);
    }
}