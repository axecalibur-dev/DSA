class Solution {
    public static int naiveCountOccurences(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {

                count++;

            }

        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 30, 40, 50, 50, 50, 70 };
        int x = 50;
        int res = naiveCountOccurences(arr, x);
        System.out.println(res);
    }
}