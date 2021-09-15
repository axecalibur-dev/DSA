class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }
    }

    public static Node deleteK(Node head, int pos) {
        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;
        printList(head);
        head = deleteK(head, 2);
        printList(head);
    }
}