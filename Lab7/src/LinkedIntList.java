public class LinkedIntList {
	private ListNode front;

	public LinkedIntList() {
		front = null;

}
// Lab 7B 1
	public boolean hasConsecutive() {
		if (front == null)
			return false;
		else {
			return front.hasConsecutive();
		}
	}
	// Lab 7B 2
	public void expand (int n) {
		if (front == null){
			return;
		}
		else front.expand(n);
	}
	// Lab 7B 3
	public ListNode RemoveFirst(int v) {
		if (front == null) {
			return null;
		}
		else {
			front.RemoveFirst(v);
		return front;
		}
	}
// Lab 7C 4
	public ListNode RemoveLast(int v){
		if(front == null){
			return null;
		}else{
			front.RemoveLast(v);
			return front;
		}
	}
	// Lab 7B 5
	public ListNode reverseThree(int k){
		if(front == null){
			System.out.println("First element null");
			return null;
		}
		else{
			front = front.reverseThree(3);
			return front;
		}
	}

	public String toString() {
		String toR = "";
		if (front == null)
			return toR+"Empty List";
		else {
			ListNode moving = front;
			while (moving != null) {
				toR = toR + " "+ moving.data;
				moving = moving.next;
			}
			return toR;
		}
	}
	
	public void add(int i) {
		if (front == null)
			front = new ListNode(i);
		else front.add(i);
	}
   
}
