import javax.lang.model.util.ElementScanner14;

class Solution {
    public static boolean isPair(int arr[], int low, int high, int x) {
        while (low < high) {
            if (arr[low] + arr[high] == x) {
                return true;
            }

            else if (arr[low] + arr[high] > x) {
                high--;
            } else {
                low++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3, 7, 8, 11 };
        int n = arr.length;
        int sum = 100;

        System.out.println(isPair(arr, 0, arr.length - 1, sum));

    }
}