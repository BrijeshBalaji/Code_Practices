class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextNode = current.next; // store next node
            current.next = prev;              // reverse current node
            prev = current;                   // move prev forward
            current = nextNode;               // move current forward
        }
        
        return prev; // new head
    }
}
