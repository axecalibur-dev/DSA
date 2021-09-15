import java.util.HashMap;

class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            left = null;
            right = null;
        }
    }

    public static void vSum(HashMap<Integer, Integer> hash, Node root, int column) {
        if (root.left != null) {
            vSum(hash, root.left, column - 1);
        }

        if (root.right != null) {
            vSum(hash, root.right, column + 1);
        }
        int data = 0;

        if (hash.containsKey(column)) {
            data = hash.get(column);
        }

        hash.put(column, root.data + data);
    }

    public static void getVerticalSum(Node root) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        vSum(hash, root, 0);
        System.out.println();

        for (int k : hash.keySet()) {
            System.out.println("POS > " + k + "WHOSE SUM > is " + hash.get(k));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        getVerticalSum(root);
    }
}