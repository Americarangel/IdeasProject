public class Node<V> {
	public V value;
	public Node<V> next;
	public V data;

	public Node head;
	public Node tail;

	public Node(V d) {
		this(d, null);
	}

	public Node() {
		this(null, null);
	}

	public Node(V d, Node<V> n) {
		next = n;
		data = d;
		this.value = value;
	}

	public void add(V d) {
		if (next == null)
			next = new Node(d);
		else
			next.add(d);
	}
}