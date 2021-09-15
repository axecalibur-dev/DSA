class Solution {
    public static int naive(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return arr.length - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1 };
        int res = naive(arr);
        System.out.println(res);
    }
}