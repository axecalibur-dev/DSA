class Solution {
    public static void span(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int spanCounter = 1;
            for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
                spanCounter++;
            }

            System.out.println("FOR ELEMENT" + arr[i] + ":" + spanCounter);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 18, 12, 13, 14, 11, 16 };
        span(arr);
    }
}