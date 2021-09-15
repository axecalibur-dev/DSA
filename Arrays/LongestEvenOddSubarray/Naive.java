
class Solution {
    public static int maxSumArray(int arr[]) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] % 2 == 0 && arr[j - 1] % 2 != 0 || arr[j] % 2 != 0 && arr[j - 1] % 2 == 0) {

                    current++;
                }

                else
                    break;
            }

            res = Math.max(res, current);
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 10, 20, 6, 3, 8 }, n = 6;

        System.out.println(maxSumArray(arr));

    }

}