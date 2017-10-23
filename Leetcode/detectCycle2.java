/* 
https://leetcode.com/problems/linked-list-cycle-ii/description/
*/
public class Solution {
    public ListNode detectCycle2(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == head){
            return head;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode slow2 = head;
                while(slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                
                return slow;
            }
        }
        
        return null;
    }
}