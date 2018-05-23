class Queue{
	class Node{
		
		private int data;
		private next Node;

		private Node(int data){
			this.data = data;
		}
	}

	Node head, tail;

	public boolean isEmpty(){
		return head == null;
	}

	public int peek(){
		return head.data;
	}

	public void add(int data){
		Node insert = new Node(data);

		if(tail != null){
			tail.next = insert;
		}

		tail = insert;
		if(head == null) head = tail;
	}

	public int remove(){
		int data = head.data;
		head = head.next;

		if(head == null) tail = null;

		return data;
	}
}