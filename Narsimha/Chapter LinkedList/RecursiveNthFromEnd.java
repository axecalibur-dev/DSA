class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node find(Node head, int k) {
        int counter = 1;
        if (head != null) {
            find(head.next, k);
            counter++;
            if (k == counter) {
                return head;
            }
        }

        return null;
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

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        // printList(head);

        // printList(head);
        Node value = find(head, 3);
        System.out.println(value);
    }
}