public class Node<V> {
	public Node<V> next;
	public V data;
	
	public Node(V d) {
		this(d,null);
	}
	
	public Node() {
		this(null, null);
	}

	public Node(V d, Node<V> n) {
		next = n;
		data = d;
	}
	
	public void add(V d) {
		if (next == null)
			next = new Node(d);
		else
			next.add(d);
	}
}

