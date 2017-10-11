

public ListNode reverseList(ListNode head) {
    
    if(head == null || head.next == null){
        return head;
    }
    ListNode prev = null, curr = head, next = head.next;
    
    while(next != null){
        curr.next = prev;
        prev = curr;
        curr = next;
        next = next.next;
    }
    
    curr.next = prev;
    
    return curr;


}