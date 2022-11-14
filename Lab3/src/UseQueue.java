import java.util.Scanner;

public class UseQueue {

	public static void main(String[] args) {

		CS112QueueInterface myQ = new CS112QueueB();
		Scanner scan = new Scanner(System.in);

		// asks user for guest # and what to count by

		System.out.println("Number of guests present: ");
		int guests = scan.nextInt();
		System.out.println("Count by: ");
		int count = scan.nextInt();

		for (int i = 1; i <= guests; i++) {
			myQ.enqueue(i);
		}
		//this adds in all the numbers in myQ
		myQ.writeQueue();
		myQ.dequeue();// removes the first index (1)
		myQ.writeQueue();

		int j = 1; //j is the position in the queue (not the actual first #)
		while (!myQ.isEmpty()) {
			if (j % count == 0) {
				myQ.dequeue();
				myQ.writeQueue();
				// if j % count == 0, the # is removed and added back to the end of the Q (but still the front, order hasn't changed)
			} else {
				int x = myQ.dequeue();
				myQ.enqueue(x);
				myQ.writeQueue();
				// if !j % count == 0, then remove from myQ and add to end of myQ in order to keep the circular order
				// you make int x because you have to keep the # in the position as a TEMPORARY variable so you can
				// add it back in to the Q by calling it
			}
			j++;
		}
	}
}