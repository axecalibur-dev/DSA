
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

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
    }

    public static Node deleteK(Node head, int pos) {

        Node current = head;
        for (int i = 1; i <= pos - 2; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        current.next.prev = current.next;
        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.prev = third;
        third.prev = second;
        second.prev = head;
        head.prev = null;
        fourth.next = null;
        head = deleteK(head, 3);
        printList(head);
    }
}