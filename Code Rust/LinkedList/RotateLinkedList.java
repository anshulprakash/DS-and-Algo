//Given a linked list, rotate the list to the right by k places, where k is non-negative.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;

        int len = findLength(head);

        k = k % len;
        if(k == 0) return head;

        int count = 1;
        //reverse the entire list
        head = reverse(head);

        ListNode curr = head;
        while(count != k){
            curr = curr.next;
            count++;
        }

        ListNode head1 = head, head2 = curr.next;
        curr.next = null;
        head1 = reverse(head1);
        head2 = reverse(head2);

        curr = head1;
        while(curr.next != null) curr = curr.next;
        curr.next = head2;

        return head1;
    }

    // function to find length of a LinkedList
    public int findLength(ListNode head){

      int len = 0;
      ListNode curr = head;
      while(curr != null){
        curr = curr.next;
        len++;
      }

      return len;
    }

    // function to reverse a linkedlist
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode curr = head, prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
