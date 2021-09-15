class Solution {
    public static int maxWater(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                rmax = Math.max(rmax, arr[j]);
            }

            res = res + Math.min(rmax, lmax) - arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 1, 2, 5 };
        int res = maxWater(arr);
        System.out.println(res);
    }
}