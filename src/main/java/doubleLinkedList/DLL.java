package doubleLinkedList;

public class DLL {

    private Node head;
    private Node tail;

    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head != null)
            head.prev = node;
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val, null, tail);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int index, int val) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node node = get(index);
        Node newNode = new Node(val, node.next, node);
        node.next.prev = newNode;
        node.next = newNode;
        size++;
    }

    private Node get(int index) {
        Node node = head;
        for(int i=1; i< index; i++) {
            node = node.next;
        }
        return node;
    }

    public void displayForward() {
        Node node = head;
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node node = tail;
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.println("END");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
