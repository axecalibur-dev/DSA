class Solution {
    public static class Node {
        Node next;
        int data;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;
        printList(head);
    }

    public static void printList(Node head) {
        if (head == null) {
            return;
        }

        System.out.println(head.data);
        for (Node current = head.next; current != head; current = current.next) {
            System.out.println(current.data);

        }
    }
}