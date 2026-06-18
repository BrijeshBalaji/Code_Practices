 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        while(head != null && head.next != null){
        }
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
    }
 *     ListNode() {}
        return res;
        ListNode res = head;
}
