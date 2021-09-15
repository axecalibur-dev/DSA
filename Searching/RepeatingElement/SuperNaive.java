class Solution {
    public static int repeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 2, 7, 98 };
        int res = repeating(arr);
        System.out.println(res);
    }
}