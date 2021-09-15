
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

    public static Node deleteEnd(Node head) {

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;
        third.prev = second;
        second.prev = head;
        head.prev = null;
        head = deleteEnd(head);
        printList(head);
    }
}