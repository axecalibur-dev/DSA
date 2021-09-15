class Solution {
    public static int naiveLastOccurence(int arr[], int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 30, 40, 50, 50, 50, 70 };
        int x = 50;
        int res = naiveLastOccurence(arr, x);
        System.out.println(res);
    }
}