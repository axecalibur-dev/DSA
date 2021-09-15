class Solution {
    public static int squareRoot(int x, int low, int high) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sqMid = mid * mid;
            if (sqMid == x) {
                return mid;
            } else if (x < sqMid) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
                ans = mid;
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        System.out.println(squareRoot(10, 1, 10));

    }
}