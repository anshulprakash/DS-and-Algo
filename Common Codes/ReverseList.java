public ListNode reverseList(ListNode head) {
    
    ListNode prev = null;
    
    while(head != null){
        ListNode front = head.next;
        head.next = prev;
        prev = head;
        head = front;
    }

    return prev;

}