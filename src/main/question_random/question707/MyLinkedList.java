package question_random.question707;


public class MyLinkedList {
    private ListNode listNode = null;
    public MyLinkedList() {
    }

    public int get(int index) {
        int i = 0;
        ListNode copy = listNode;
        while (copy!=null){
            if (i == index) {
                return copy.val;
            }
            copy = copy.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        listNode = new ListNode(val,listNode);
    }

    public void addAtTail(int val) {
        if (listNode ==null) {
            listNode = new ListNode(val);
            return;
        }
        ListNode copy = listNode;
        while (copy.next!=null){
            copy = copy.next;
        }
        copy.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val) {
        if (index == 0 ){
            this.addAtHead(val);
            return;
        }

        ListNode copy = listNode;
        int i = 0;
        while (copy!=null){
            if (i == index-1) {
                copy.next= new ListNode(val,copy.next);
                break;
            }
            copy = copy.next;
            i ++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0 ){
            listNode = listNode.next;
            return;
        }

        ListNode copy = listNode;
        int i = 0;
        while (copy!=null){
            if (i == index-1 && copy.next != null) {
                copy.next= copy.next.next;
                break;
            }
            copy = copy.next;
            i ++;
        }
    }

}

class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}