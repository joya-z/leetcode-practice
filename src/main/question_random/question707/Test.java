package question_random.question707;

public class Test {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        System.out.println(linkedList.get(1));
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        System.out.println(linkedList.get(1));

        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addAtTail(1);
        System.out.println(linkedList2.get(0));

        //["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
        //[[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
        MyLinkedList linkedList3 = new MyLinkedList();
        linkedList3.addAtHead(2);
        linkedList3.deleteAtIndex(1);
        linkedList3.addAtHead(2);
        linkedList3.addAtHead(7);
        linkedList3.addAtHead(3);
        linkedList3.addAtHead(2);
        linkedList3.addAtHead(5);
        linkedList3.addAtTail(5);
        linkedList3.get(5);
        linkedList3.deleteAtIndex(6);
        linkedList3.deleteAtIndex(4);
        System.out.println(linkedList3);
    }
}
