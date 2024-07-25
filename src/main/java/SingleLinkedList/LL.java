package SingleLinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node last = new Node(val);
        tail.next = last;
        tail = last;
        size+=1;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i< index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public void recursiveInsert(int index, int val, Node node) {
        if(index == 1) {
            Node newNode = new Node(val);
            if(node.next != null)
                newNode.next = node.next;
            node.next = newNode;
            size++;
            return;
        }
        if(node == null) {
            node = head;
        }
        recursiveInsert(--index, val, node.next);

    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(size <=1) {
            deleteFirst();
        }
        int val = tail.value;
        Node node = get(size-2);
        node.next= null;
        tail = node;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for(int i = 0; i< index; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        Node previousNode = get(index-1) ;
        int value = previousNode.next.value;
        previousNode.next = previousNode.next.next;
        size--;
        return value;
    }

    public Node Find(int val) {
        Node node = head;
        while(node != null) {
            if(node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void bubbleSort() {
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0) {
            return;
        }
        if(col < row) {
            Node first = get(col);
            Node second = get(col +1);

            if(first.value > second.value) {
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail) {
                    Node prev = get(col -1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col -1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col +1);
        } else {
            bubbleSort(row-1, 0);
        }

    }


    public void printReverse() {
        printReverse(head);
        System.out.println("HEAD");
    }

    private void printReverse(Node node) {
        if(node == null) {
            return;
        }
        printReverse(node.next);
        System.out.print(node.value + " -> ");
    }

    private class Node {
        int value;
        Node next;

        public Node() {}
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void reverseList() {
        inPlaceReverse(head);
    }
    // recursive reverse
    private  void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //in place reversal
    private void inPlaceReverse(Node node) {
        if(node == null)
            return;
        Node prev = null;
        Node pres = node;
        Node next = node.next;
        while(pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    public void swapPairs() {
        Node pairs = swapPairs(head);
        while(pairs != null) {
            System.out.print(pairs.value + " -> ");
            pairs = pairs.next;
        }
        System.out.println("End");
    }
    public Node swapPairs(Node head) {
        if(head == null) {
            return head;
        }
        Node f = head;
        Node s = head;
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while(f != null && f.next != null) {
            s = s.next;
            tail.next = new Node(s.value);
            tail = tail.next;
            tail.next = new Node(f.value);
            tail = tail.next;
            f = f.next.next;
            s= s.next;
        }
        if(s != null) {
            tail.next = s;
            tail = tail.next;
        }

        return dummyHead.next;
    }


}
