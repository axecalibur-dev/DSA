class Solution {
    public static int mergeandsort(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int res = 0;
        int i = 0;
        int j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            }

            else {
                arr[k] = right[j];
                res = res + (n1 - i);
                j++;
            }

            k++;

        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public static int countInversions(int arr[], int low, int high) {
        int res = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            res += countInversions(arr, low, mid);
            res += countInversions(arr, mid + 1, high);
            res += mergeandsort(arr, low, mid, high);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3, 5 };

        int n = arr.length;
        System.out.print(countInversions(arr, 0, n - 1));
    }
}