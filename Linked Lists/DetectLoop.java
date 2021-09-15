import java.util.HashSet;

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

    public static boolean isLoop(Node head) {
        HashSet<Node> set = new HashSet<>();
        for (Node current = head; current != null; current = current.next) {
            if (set.contains(current)) {
                return true;
            } else {
                set.add(current);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(15);
        Node third = new Node(12);
        Node fourth = new Node(20);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        if (isLoop(head)) {
            System.out.println("Loop present");
        } else {
            System.out.println("Loop not present");
        }
    }
}