class Solution {
    public static int superNaive(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1 };
        int count = superNaive(arr);
        System.out.println(count);
    }
}