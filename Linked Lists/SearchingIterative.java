class Solution {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;
        printList(head);
        System.out.println("Pos of element" + search(head, 20));
    }

    public static int search(Node head, int x) {
        int pos = 1;
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return pos;
            } else {
                pos++;
                current = current.next;
            }
        }

        return -1;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }

        System.out.println();
    }
}