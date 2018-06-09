class LRUCache {

    class Node{
      int key, value;
      Node next, prev;
      Node(int key, int value){
        this.key = key;
        this.value = value;
      }

      Node(){}
    }
    private Node head, tail;
    private int count, capacity;
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    private void add(Node node){
      node.prev = head;
      node.next = head.next;
      head.next.prev = node;
      head.next = node;
    }

    private Node popTail(){
      Node rem = tail.prev;
      remove(rem);
      return rem;
    }

    private void remove(Node node){
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }

    private void moveToHead(Node node){
      remove(node);
      add(node);
    }

    public int get(int key) {
      Node curr = map.get(key);
      if(curr != null){
        moveToHead(curr);
        return curr.value;
      }else{
        return -1;
      }
    }

    public void put(int key, int value) {
      Node curr = map.get(key);
      if(curr == null){
        curr = new Node(key, value);
        map.put(key, curr);
        add(curr);
        count++;
        if(count > capacity){
          Node rem = popTail();
          map.remove(rem.key);
          count--;
        }
      }else{
        curr.value = value;
        moveToHead(curr);
      }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
