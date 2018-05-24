//Given a singly linked list, return nth from last node. Return null if 'n' is out-of-bounds.

public class NthFromLastNode{
  class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
      this.val = val;
    }
  }

  public static ListNode findNode(ListNode head, int n){
    if(head == null) return null;

    int count = 0;
    ListNode curr = head, temp = head;
    while(count < n){
      if(temp == null) return null;
      temp = temp.next;
      count++;
    }

    while(temp != null){
      curr = curr.next;
      temp = temp.next;
    }

    return curr;
  }
}
