
public interface CS112QueueInterface {

	void writeQueue(); //prints out the whole queue

	void enqueue(int j); // adds to queue

	int dequeue(); // takes out element from queue and returns it

	boolean isEmpty();
	
	int peek(); // prints head of the Q (first element) without remoing it


}