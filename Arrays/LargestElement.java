class Solution {
    public static int largestElement(int arr[]) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 88, 99, 117, 22 };
        int res = largestElement(arr);
        System.out.println(res);
    }
}