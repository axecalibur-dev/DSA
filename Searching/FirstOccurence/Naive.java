class Solution {
    public static int firstOccurence(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 10, 20, 30 };
        int x = 10;
        int res = firstOccurence(arr, x);
        System.out.println(res);
    }
}