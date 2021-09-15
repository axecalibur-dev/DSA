import java.util.*;

class Solution {
    public static class Node {
        int data;
        Vector<Node> child;

        Node(int d) {
            this.data = d;
            child = new Vector<Node>();
        }
    }

    public static int siblings(Node root, int x) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            Node out = queue.poll();
            for (int i = 0; i < out.child.size(); i++) {
                if (out.child.get(i).data == x) {
                    System.out.println("Size of Current Child Vector" + out.child.size()x);
                    return out.child.size() - 1;
                }

                queue.add(out.child.get(i));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        (root.child).add(new Node(2));
        (root.child).add(new Node(30));
        (root.child).add(new Node(14));
        (root.child).add(new Node(60));
        (root.child.get(0).child).add(new Node(15));
        (root.child.get(0).child).add(new Node(25));
        (root.child.get(0).child.get(1).child).add(new Node(70));
        (root.child.get(0).child.get(1).child).add(new Node(100));
        (root.child.get(1).child).add(new Node(6));
        (root.child.get(1).child).add(new Node(1));
        (root.child.get(2).child).add(new Node(7));
        (root.child.get(2).child.get(0).child).add(new Node(17));
        (root.child.get(2).child.get(0).child).add(new Node(99));
        (root.child.get(2).child.get(0).child).add(new Node(27));
        (root.child.get(3).child).add(new Node(16));

        int x = 100;
        int res = siblings(root, x);
        System.out.println(res);
    }
}