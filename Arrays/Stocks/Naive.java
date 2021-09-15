class Solution {
    public static int maxProfit(int price[], int start, int end) {
        if (start >= end) {
            return 0;
        }

        int profit = 0;
        for (int i = start; i < end - 1; i++) {
            for (int j = i + 1; j < end; j++) {
                if (price[j] > price[i]) {
                    int current_profit = (price[j] - price[i]) + maxProfit(price, start, i - 1)
                            + maxProfit(price, j + 1, end);

                    profit = Math.max(profit, current_profit);
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 12 };

        int res = maxProfit(arr, 0, arr.length);
        System.out.println(res);
    }
}