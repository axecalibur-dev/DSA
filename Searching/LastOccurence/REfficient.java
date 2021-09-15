import javax.lang.model.element.Element;

class Solution {
    public static int recursiveLastOccurence(int arr[], int low, int high, int x) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (x < arr[mid]) {
            return recursiveLastOccurence(arr, low, mid - 1, x);
        }

        else if (x > arr[mid]) {
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

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 20, 30, 40 };
        int x = 20;
        int res = recursiveLastOccurence(arr, 0, arr.length - 1, x);
        System.out.println(res);
    }
}