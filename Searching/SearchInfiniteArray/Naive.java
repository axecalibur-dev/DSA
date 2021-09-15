public class Naive {

}

class Solution {
    public static int naiveSearch(int arr[], int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x) {
                return i;
            }

            if (arr[i] > x) {
                return -1;
            }

            i++;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 5, 5 };

        int x = 4;
        int res = naiveSearch(arr, x);

        System.out.println(res);
    }
}