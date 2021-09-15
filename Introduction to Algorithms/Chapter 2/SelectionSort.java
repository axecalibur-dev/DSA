class Solution {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_number_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_number_index]) {
                    min_number_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_number_index];
            arr[min_number_index] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 15, 19, 1, 2, 22 };
        sort(arr);
        print(arr);
    }

}