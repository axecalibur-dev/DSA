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
            System.out.println("Elements : " + current.data);
            current = current.next;
        }
    }

    public static Node deleteNode(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = null;
        System.out.println("Before deletion");
        printList(head);
        System.out.println("After deletion");
        head = deleteNode(head);
        printList(head);
    }
}