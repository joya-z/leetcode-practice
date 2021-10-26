package question1_to_question20.question19;


import base.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2,node1);
        ListNode node3 = new ListNode(3,node2);
        ListNode node4 = new ListNode(4,node3);

        ListNode node = solution.removeNthFromEnd(node4, 2);
        while (node != null){
            System.out.print(node.val +"\t");
            node = node.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy = head;
        int length = 0 ;
        while(copy !=null) {
            length ++;
            copy = copy.next;
        }

        if (n == length) {
            return head.next;
        }

        ListNode result = head;
        int m =1;
        while (head != null) {
            if (m == length-n){
                head.next = head.next.next;
            }
            head = head.next;
            m++;
        }
        return result;
    }

}
