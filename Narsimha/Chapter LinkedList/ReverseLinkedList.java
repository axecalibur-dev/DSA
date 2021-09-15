class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public static Node reverse(Node head) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node nextPointer = current.next;
            current.next = prev;
            prev = current;
            current = nextPointer;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;

        printList(head);
        head = reverse(head);
        printList(head);
    }
}