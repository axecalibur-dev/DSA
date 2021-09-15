class Solution {
    public static int maxOnes(int arr[]) {

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 1) {
                    curr++;

                } else
                    break;
                {

                }
            }

            res = Math.max(curr, res);
        }

        return res;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 1, 1, 0, 1, 1 };
        int res = maxOnes(arr);
        System.out.println(res);
    }
}