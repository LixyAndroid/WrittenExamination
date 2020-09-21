package September.test0908;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }

}

public class Main {


    public static void main(String[] args) {
        // write your code here
    }

    //递归反转链表
    public static ListNode resverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode res = resverseListNode(head.next);
        head.next.next = head;
        head.next = null;
        return res;

    }
}
