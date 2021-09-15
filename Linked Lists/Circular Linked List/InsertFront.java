class Solution {
    public static class Node {
        Node next;
        int data;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp = temp.next;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = temp;
            temp.next = head;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = head;

        head = insertBegin(head, 40);
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