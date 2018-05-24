// Node indices starts from 1.
static LinkedListNode swap_nth_node(LinkedListNode head, int n) {
  LinkedListNode prev = null;
  LinkedListNode current = head;

  if (head == null) {
    return head;
  }

  if (n == 1) {
    // No need to swap head with head.
    return head;
  }

  for (int count = 1;
       current != null && count < n;
       ++count) {
    prev = current;
    current = current.next;
  }

  if (current == null) {
    return head;
  }

  // current is pointing to nth node.
  // Let's swap nth node with head.

  prev.next = head;
  LinkedListNode temp = head.next;
  head.next = current.next;
  current.next = temp;

  return current;
}
