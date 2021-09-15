class Solution {
    public int countMaintain(String str) {
        char count[] = new char[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[str.charAt(i)] > 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str = "geeksforgeeks";
        int res = sol.countMaintain(str);
        System.out.println(res);

    }
}