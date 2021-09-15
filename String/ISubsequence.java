import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class Solution {
    public boolean isSubSeq(String s1, String s2, int n, int m) {
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }

        return j == m;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCDEF";
        String str2 = "ABDX";
        int n = str1.length();
        int m = str2.length();

        boolean res = sol.isSubSeq(str1, str2, n, m);
        System.out.println(res);
    }
}