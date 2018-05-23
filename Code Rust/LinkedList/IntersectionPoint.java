/*
Given head nodes of two linked lists that may or may not intersect,
find out if they intersect and return the point of intersection; return null otherwise.
*/
public class IntersectionPoint{
  class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
      this.val = val;
    }
  }

  public static ListNode findIntersection(ListNode headA, ListNode headB){
    if(headA == null || headB == null) return null;

    ListNode a = headA, b = headB;

    while(a != b){
      if(a == null){
        a = headB;
      }else{
        a = a.next;
      }
      if(b == null){
        b = headA;
      }else{
        b = b.next;
      }
    }

    return a
    ;
  }
}
