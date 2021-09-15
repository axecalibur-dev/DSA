
class Solution {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void printMiddle(Node head) {
        if (head == null) {
            return;
        }

        int count = 0;
        Node current;
        for (current = head; current != null; current = current.next) {
            count++;
        }

        current = head;
        for (int i = 0; i < count / 2; count++) {
            current = current.next;
        }

        System.out.println(current.data);
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;
        printList(head);
        printMiddle(head);

    }
}