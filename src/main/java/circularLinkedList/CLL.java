package circularLinkedList;

public class CLL {

    private Node head;
    private Node tail;


    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
            tail.next = node;
            node.next = head;
            tail = node;
    }

    public void display() {
        Node node = head;
        do {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        while(node != head);
        System.out.println("END");
    }

    public void delete(int val) {
        Node node = head;
        if(node == null) {
            return;
        }
        if(head.val == val) {
            head.next = head;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.val == val) {
                node.next  = n.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
