public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middle = findMiddle(head), right = middle.next;
        middle.next = null;
        return merge(sortList(head), sortList(right));
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0), current = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) { current.next = left; left = left.next; }
            else { current.next = right; right = right.next; }
            current = current.next;
        }
        current.next = (left != null) ? left : right;
        return dummy.next;
    }
}
