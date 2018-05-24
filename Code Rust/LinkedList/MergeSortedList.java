//Given two sorted linked lists, merge them such that resulting linked list is also sorted.

public static ListNode merge(ListNode l1, ListNode l2){

  ListNode curr1 = l1;
  ListNode curr2 = l2;
  ListNode dummyHead = new ListNode(-1);
  ListNode curr = dummyHead;

  while(curr1 != null && curr2 != null){
    if(curr1.val > curr2.val){
      curr.next = curr1;
      curr1 = curr1.next;
    }else{
      curr.next = curr2;
      curr2 = curr2.next;
    }
    curr = curr.next;
  }

  curr.next = (curr1 == null? curr2 : curr1);

  return dummyHead.next;
}
