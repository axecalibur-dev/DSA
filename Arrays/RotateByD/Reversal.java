class Solution {
    public static void leftRotate(int arr[], int d, int n) {
        reversal(arr, 0, d - 1);
        reversal(arr, d, n - 1);
        reversal(arr, 0, n - 1);
        print(arr);
    }

    public static void reversal(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 2;
        leftRotate(arr, d, arr.length);
    }
}