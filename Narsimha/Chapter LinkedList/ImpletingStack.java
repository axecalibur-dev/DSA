class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printList(Node head) {
        if (head == null) {
            System.out.println("Nothing to print");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");

                current = current.next;
            }
        }
    }

    public static Node push(Node head, int x) {
        Node newNode = new Node(x);

        if (head == null) {
            System.out.println("Empty Stack ( LL ) ");
        }

        newNode.next = head;

        return newNode;
    }

    public static void peek(Node head) {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node current = head;
            System.out.println(current.data);
        }
    }

    public static Node pop(Node head) {
        Node current = head;
        if (head == null) {
            System.out.println("Empty Stack");
        }

        else {
            head = head.next;
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = null;
        // printList(head);
        head = push(head, 5);
        head = pop(head);
        printList(head);
        peek(head);
    }
}