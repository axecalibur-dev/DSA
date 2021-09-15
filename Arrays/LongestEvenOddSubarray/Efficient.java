class Solution {
    public static int subarray(int arr[]) {
        int res = 1;
        int current = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) && arr[i - 1] % 2 != 0 || (arr[i] % 2 != 0) && arr[i - 1] % 2 == 0) {
                current++;
                res = Math.max(current, res);
            } else {
                current = 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        int res = subarray(arr);
        System.out.println(res);
    }
}