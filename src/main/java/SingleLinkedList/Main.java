package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
      /*  LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(33);
        list.insert(8, 2);
        list.display();
        list.insertRec( 12, 3);
        list.display();*/

        /*  MergeSort.ListNode head = new MergeSort.ListNode(6, new MergeSort.ListNode(5, new MergeSort.ListNode(4, new MergeSort.ListNode(3, new MergeSort.ListNode(2, new MergeSort.ListNode(1))))));
        MergeSort sort = new MergeSort();
        head = sort.sortList(head);
        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("end");*/

        /*list.display();

        list.printReverse();*/

        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        list.display();

        list.swapPairs();


    }
}
