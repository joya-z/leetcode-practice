package question21;


import base.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode listNode = solution.mergeTwoLists(l1, l2);
        while (listNode !=null) {
            System.out.print(listNode.val +"\t");
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode result = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                listNode.next = new ListNode(l1.val);
                listNode = listNode.next;
                l1 = l1.next;
            } else {
                listNode.next = new ListNode(l2.val);
                listNode = listNode.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            listNode.next = l1;
        }
        if (l2 != null) {
            listNode.next = l2;
        }
        return result.next;
    }

}
