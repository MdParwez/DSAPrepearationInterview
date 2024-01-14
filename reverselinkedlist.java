class Solution {

    public ListNode reverseList(ListNode head) {
    
    ListNode current =   head;
    ListNode previous =  null;

    while(current != null){
        ListNode nextNode = current.next;
        current.next = previous;
        previous = current;
        current = nextNode;
    }
    return previous;
    }
}
