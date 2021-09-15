class Solution {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            next = null;
            prev = null;
        }
    }

    public static int countNodes(Node head) {
        int count = 0;
        Node current = head;
        while (current.next != null) {
            count++;

            current = current.next;
        }

        return count;
    }

    static void printList(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static Node sortedListToBST(Node head) {
        int n = countNodes(head);
        System.out.println(n);

        return sortedListToBSTRecur(n, head);
    }

    public static Node sortedListToBSTRecur(int n, Node head) {
        if (n <= 0) {
            return null;
        }

        Node left = sortedListToBSTRecur(n / 2, head);
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        Node second = new Node(6);
        Node third = new Node(5);
        Node fourth = new Node(6);
        Node fifth = new Node(4);
        Node sixth = new Node(3);
        Node seventh = new Node(2);
        Node eigth = new Node(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eigth;
        eigth.next = null;

        head.prev = null;
        second.prev = head;
        third.prev = second;
        fourth.prev = third;
        fifth.prev = fourth;
        sixth.prev = fifth;
        seventh.prev = sixth;
        eigth.prev = seventh;

        sortedListToBST(head);
    }
}