class Solution {
    public static void freq(int arr[]) {
        int freq = 1;
        int i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i - 1] == arr[i]) {
                freq++;
                i++;
            }

            System.out.println(arr[i - 1] + " FREQ : " + freq);
            i++;
            freq = 1;
        }

        if (arr.length == 1 || arr[arr.length - 1] != arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1] + " FREQ : " + 1);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 20, 20, 20, 30, 30, 40 };
        freq(arr);
    }
}