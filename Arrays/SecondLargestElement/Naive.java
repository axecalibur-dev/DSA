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

    public static int secondLargest(int arr[]) {
        int largest = largestElement(arr);
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1) {
                    res = i;
                }

                else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 99, 88, 11, 33, 98 };
        int res = secondLargest(arr);
        System.out.println(res);
    }
}