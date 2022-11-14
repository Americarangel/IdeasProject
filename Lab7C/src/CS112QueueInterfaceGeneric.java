public interface CS112QueueInterfaceGeneric<V> {

	public void writeQueue();

	public void enqueue(V j);

	public void dequeue();

	public boolean isEmpty();
	
	public V peek();

}
