class Solution {
    public boolean isPal(String str) {
        int begin = 0;
        int end = str.length() - 1;
        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                return false;
            }

            begin++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str = "XBBXF`";
        boolean res = sol.isPal(str);
        System.out.println(res);
    }
}