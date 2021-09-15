class Solution {
    public static int repeating(int arr[]) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[arr[i]]) {
                return arr[i];
            }

            visited[arr[i]] = true;
        }

        return -1;

    }

    public static void main(String args[]) {

        int arr[] = { 0, 2, 1, 3, 2, 2 }, n = 6;

        System.out.println(repeating(arr));

    }
}