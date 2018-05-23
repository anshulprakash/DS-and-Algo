// Given head pointer of a linked list, sort it in ascending order using insertion sort.
public class InsertionSort {

    class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
        this.val = val;
      }
    }

    public static ListNode sort(ListNode head){
      if(head == null || head.next == null) return head;

        ListNode newHead = new ListNode(-1);
        newHead.next = new ListNode(head.val);
        ListNode curr = head.next;

        while(curr != null){

            ListNode newCurr = newHead.next, prev = newHead;
            while(prev != null){
                if(newCurr != null && curr.val > newCurr.val){
                    prev = newCurr;
                    newCurr = newCurr.next;
                }else{
                    prev.next = new ListNode(curr.val);
                    prev.next.next = newCurr;
                    break;
                }
            }

            curr = curr.next;
        }

        return newHead.next;
    }
}
