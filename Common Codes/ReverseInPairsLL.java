public ListNode reverseInPairs(ListNode head) {
        
    if(head == null || head.next == null){
        return head;
    }
    
    ListNode p1 = head;
    ListNode p2 = head.next;
    
    while(p1 != null && p2 != null){
        int temp = p1.data;
        p1.data = p2.data;
        p2.data = temp;
        
        p1 = p1.next.next;
        if(p2.next != null){
            p2 = p2.next.next;    
        }else{
            break;
        }
        
    }


    return head;

    
}