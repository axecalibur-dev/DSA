class Solution {
    public static int maxProfit(int arr[]) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 12 };

        int res = maxProfit(arr);
        System.out.println(res);
    }
}