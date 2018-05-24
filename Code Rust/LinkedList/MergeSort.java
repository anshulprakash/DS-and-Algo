public static ListNode sortList(ListNode head){
  if(head == null || head.next == null) return head;

  ListNode slow = head, fast = head, prev = null;

  while(fast != null && fast.next != null){
    prev = slow;
    slow = slow.next;
    fast = fast.next.next;
  }

  prev.next = null;

  ListNode l1 = sortList(head);
  ListNode l2 = sortList(slow);

  return merge(l1, l2);
}

public static ListNode mergeList(ListNode l1, ListNode l2){

  ListNode dummyHead = new ListNode(-1), curr = dummyHead;

  while(l1 != null && l2 != null){
    if(l1.val > l2.val){
      curr.next = l1;
      l1 = l1.next;
    }else{
      curr.next = l2;
      l2 = l2.next;
    }
    curr = curr.next;
  }

  curr.next = (l1 == null ? l2 : l1);

  return dummyHead.next;
}
