class Solution {

    public int find(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 31, 41, 59, 26, 41, 58 };
        Solution sol = new Solution();
        int x = 59;
        int res = sol.find(arr, x);
        System.out.println(res);
    }
}