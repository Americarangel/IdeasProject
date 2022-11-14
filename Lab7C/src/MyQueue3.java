public class MyQueue3<V> implements CS112QueueInterfaceGeneric<V>{
	private Node<V> head;
	private Node<V> tail;

	public void writeQueue() {
		Node moving = head;
		while(moving != null) {
			System.out.println(" " + moving.data + " ");
			moving = moving.next;
			}
		if (head == null)
			System.out.println("/nQueue is empty");
		}

	public void enqueue(V j) { // adds to the back
		Node temp = new Node(j);
		if(this.tail == null) {
			this.head = temp;
			this.tail = temp;
			return; //return works as a break once we reach the end of the list
		}
		this.tail.next = temp;
		this.tail = temp;
	}

	public void dequeue() { /* think of remove first in lab 7B;
							 void because we are not returning anything */
		if (this.head == null)
			return;

		// Store move nodes ahead 1 to delete a node
		Node temp = this.head;
		this.head = this.head.next;

		if (this.head == null)
			this.tail = null;
		if (head == null) {
			return;
		}
	}

	public boolean isEmpty() {
		//checking the size
		return head == null;

	}

	public V peek() {
		//get what's at the head
		return (V) head.value;

	}
}

