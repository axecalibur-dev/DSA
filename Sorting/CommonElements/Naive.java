class Solution {
    public static void getCommon(int arr[], int brr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] == arr[i]) {
                continue;
            }

            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    System.out.println("Element:" + arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
        int brr[] = { 5, 10, 10, 15, 30 };
        getCommon(arr, brr);
    }
}