import javax.lang.model.element.Element;

class Solution {
    public static int maxOnes(int arr[]) {
        int res = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                current = 0;
            } else {
                current++;
                res = Math.max(res, current);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 1, 1, 0, 1, 1 };
        int res = maxOnes(arr);
        System.out.println(res);
    }
}