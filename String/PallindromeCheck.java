// Naive Method

import java.util.*;

class Solution {
    public boolean isPal(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str = "ABBAX";
        boolean res = sol.isPal(str);
        System.out.println(res);
    }
}