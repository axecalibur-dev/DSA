class Solution {
    public static void union(int arr[], int brr[]) {
        int c[] = new int[arr.length + brr.length];
        for (int i = 0; i < arr.length; i++) {
            c[i] = arr[i];
        }

        for (int i = 0; i < brr.length; i++) {
            c[arr.length + i] = brr[i];
        }

        sort(c);

        for (int i = 0; i < arr.length + brr.length; i++) {
            if (i == 0 || c[i] != c[i - 1])
                System.out.print(c[i] + " ");
        }

    }

    // Sort Function

    public static void sort(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min_idx = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            temp[i] = arr[min_idx];
            arr[min_idx] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int a[] = new int[] { 3, 8, 10 };
        int b[] = new int[] { 2, 8, 9, 10, 15 };
        union(a, b);
    }
}