import java.util.*;

class Solution {
    int bucket;
    ArrayList<LinkedList<Integer>> table;

    Solution(int b) {
        this.bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    public void insert(int k) {
        int i = k % bucket;
        table.get(i).add(k);
    }

    public boolean search(int k) {
        int i = k % bucket;
        return table.get(i).contains(k);
    }

    void delete(Integer k) {
        int i = k % bucket;
        table.get(i).remove(k);
    }

    public static void main(String[] args) {
        Solution sol = new Solution(7);
        sol.insert(10);
        sol.insert(20);
        sol.insert(15);
        sol.insert(7);
        System.out.println(sol.search(20));
        sol.delete(15);
        System.out.println(sol.search(15));

    }
}