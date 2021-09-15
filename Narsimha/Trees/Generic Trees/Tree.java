import java.util.*;

class Solution {
    public static class Node {
        int data;
        Vector<Node> child = new Vector<>();

        Node(int d) {
            this.data = d;
        }
    }

    public static void Traverse(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            int n = queue.size();
            while (n > 0) {
                Node out = queue.poll();
                System.out.print(out.data);

                for (int i = 0; i < out.child.size(); i++) {
                    queue.add(out.child.get(i));
                }

                n--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.child.add(new Node(2));
        root.child.add(new Node(34));
        root.child.add(new Node(56));
        root.child.add(new Node(100));
        root.child.add(new Node(77));
        root.child.add(new Node(88));
        root.child.add(new Node(1));
        root.child.add(new Node(7));
        root.child.add(new Node(8));
        root.child.add(new Node(9));
        Traverse(root);

    }
}