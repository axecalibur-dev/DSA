class Solution {
    public static int histogram(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                } else {
                    break;
                }
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                } else {
                    break;
                }
            }

            res = Math.max(res, curr);

        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 2, 5, 4, 1, 5, 6 };

        System.out.print("Maximum Area: " + histogram(arr));

    }

}