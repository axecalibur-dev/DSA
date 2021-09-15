class Solution {
    public static class Node {
        Node next;
        int data;

        Node(int d) {
            this.data = d;
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

    public static Node insertSorted(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }

        if (data < head.data) {
            temp.next = head;
            return temp;
        }

        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }

        temp.next = current.next;
        current.next = temp;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;
        head = insertSorted(head, 45);
        printList(head);
    }
}