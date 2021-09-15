class Solution {
    public static void leader(int arr[]) {
        int current_leader = arr[arr.length - 1];
        System.out.println(current_leader);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > current_leader) {
                current_leader = arr[i];
                System.out.println(current_leader);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 6, 5, 2 };
        leader(arr);
    }
}