package question2;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode listNode = solution.addTwoNumbers(l1, l2);
        while (listNode!=null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode resoult = listNode;
        int temp = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val+l2.val + temp;
            listNode.next = new ListNode(sum%10);
            temp = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            listNode =  listNode.next;
        }

        while (l1 != null) {
            int sum = l1.val + temp;
            listNode.next = new ListNode(sum%10);
            temp = sum/10;
            l1 = l1.next;
            listNode = listNode.next;
        }

        while (l2 != null) {
            int sum = l2.val + temp;
            listNode.next = new ListNode(sum%10);
            temp = sum/10;
            l2 = l2.next;
            listNode = listNode.next;
        }
        if (temp !=0) {
            listNode.next = new ListNode(temp);
        }

        return  resoult.next;
    }
}
