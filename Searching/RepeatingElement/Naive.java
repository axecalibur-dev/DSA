import java.util.Arrays;

class Solution {
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

    public static int repeating(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 4, 4, 3, 3, 1, 3 };
        int res = repeating(arr);
        System.out.println(res);
    }
}