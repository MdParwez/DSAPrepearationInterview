public class Solution {
  public ListNode sortList(ListNode head) {
    // Base case: If the list is empty or has only one element, it is already sorted
    if (head == null || head.next == null)
      return head;
        
    // Split the list into two halves using the slow and fast pointers
    ListNode prev = null, slow = head, fast = head;
    
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    
    prev.next = null; // Break the link to split the list into two halves
    
    // Recursively sort each half of the list
    ListNode l1 = sortList(head);
    ListNode l2 = sortList(slow);
    
    // Merge the sorted halves
    return merge(l1, l2);
  }
  
  // Helper function to merge two sorted linked lists
  ListNode merge(ListNode l1, ListNode l2) {
    ListNode l = new ListNode(0), p = l; // Dummy node to simplify code, p is used to build the merged list
    
    // Merge the two sorted lists
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        p.next = l1;
        l1 = l1.next;
      } else {
        p.next = l2;
        l2 = l2.next;
      }
      p = p.next; // Move to the next node in the merged list
    }
    
    // Append the remaining nodes of either l1 or l2 (if any)
    if (l1 != null)
      p.next = l1;
    
    if (l2 != null)
      p.next = l2;
    
    return l.next; // Return the merged sorted list
  }
}



/*
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
*/
