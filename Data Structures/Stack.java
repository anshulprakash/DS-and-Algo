class Stack{
	class Node{
		private int data;
		private Node next;

		private Node(int data){
			this.data = data;
		}
	}

	private Node top;

	public boolean isEmpty(){
		return top == null;
	}

	public int peek(){
		return top.data;
	}

	public int push(int data){
		Node insert = new Node(data);
		insert.next = top;
		top = insert;
	}

	public int pop(){
		int data = top.data;

		top = top.next;
		
		return data;
	}
}