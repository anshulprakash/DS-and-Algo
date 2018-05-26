private static int find_length(LinkedListNode head) {
  int len = 0;

  while (head != null) {
    ++len;
    head = head.next;
  }

  return len;
}

private static int adjust_rotations_needed(int n, int len) {
  // If n is positive then number of rotations performed is from right side
  // and if n is negative then number of rotations performed from left side
  // Let's optimize the number of rotations.
  // Handle case if 'n' is a negative number.
  n = n % len;

  if (n < 0) {
    n = n + len;
  }

  return n;
}

public static LinkedListNode rotate_list(LinkedListNode head, int n) {
  if (head == null || n == 0) {
    return head;
  }

  int len = find_length(head);

  // If n (number of rotations required) is bigger than
  // length of linked list or if n is negative then
  // we need to adjust total number of rotations needed
  n = adjust_rotations_needed(n, len);

  if (n == 0) {
    return head;
  }

  // Find the start of rotated list.
  // If we have 1,2,3,4,5 where n = 2,
  // 4 is the start of rotated list.
  int rotations_count = len - n - 1;
  LinkedListNode temp = head;

  while (rotations_count > 0) {
    rotations_count--;
    temp = temp.next;
  }

  // After the above loop temp will be pointing
  // to one node prior to rotation point
  LinkedListNode new_head = temp.next;

  // Set new end of list.
  temp.next = null;

  // Iterate to the end of list and
  // link that to original head.
  temp = new_head;
  while (temp.next != null) {
    temp = temp.next;
  }
  temp.next = head;

  return new_head;
}
