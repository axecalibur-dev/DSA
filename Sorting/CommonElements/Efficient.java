class Solution {
    public static void getCommons(int arr[], int brr[]) {
        int i = 0;
        int j = 0;
        while (i < arr.length && j < brr.length) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }

            if (arr[i] < brr[j]) {
                i++;
            }

            else if (arr[i] > brr[j]) {
                j++;
            }

            else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int brr[] = { 5, 10, 10, 15, 30 };
        int arr[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
        getCommons(arr, brr);
    }

}