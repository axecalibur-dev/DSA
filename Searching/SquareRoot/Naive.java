class Solution {
    public static int naive(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;
        }

        return (i - 1);
    }

    public static void main(String[] args) {
        int x = 265;
        int res = naive(x);
        System.out.println(res);
    }
}