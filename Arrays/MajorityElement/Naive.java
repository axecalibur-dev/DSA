class Solution {
    public static int getMajority(int arr[]) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

                if (count > arr.length / 2) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 };
        int res = getMajority(arr);
        System.out.println(res);
    }
}