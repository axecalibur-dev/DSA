class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        head.next = first;
        first.next = second;
        second.next = null;
        System.out.println(head.data + "->" + first.data + "->" + second.data + "-|");
    }
}