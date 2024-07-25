package doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertLast(5);
        list.insertFirst(2);
        list.insertLast(6);
        list.insert(2, 4);
        list.displayForward();
        list.displayReverse();
    }
}
