public class ListNode {
	public int data;       // data stored in this node
	public ListNode next;  // a link to the next node in the list

	public ListNode() {
		this(999, null);
	}

	public ListNode(int data) {
		this(data, null);
	}

	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	public void add(int i) {
		if (next == null)
			next = new ListNode(i);
		else next.add(i);
	}

	// Lab 7B 1
	public boolean hasConsecutive() {
		if (this.next == null) {
			return false;
		} else {
			if (this.next.data - this.data == 1) {
				return true;
			} else return this.next.hasConsecutive();
		}
	}

	// Lab 7B 2
	public void expand(int n) {
		ListNode expanded = this.next;
		for (int i = 0; i < n; i++) {
			this.next = new ListNode(this.data, this.next);
//			data = next.data;
		}
		if (expanded != null) {
			expanded.expand(n);
		}
	}

	// Lab 7B 3
	public ListNode RemoveFirst(int v) {
		ListNode prev = null;
		ListNode front = this;
		if (front == null) {
			return null;
		}
		if (front.data == v) {
			prev = front;
			front = front.next;
			return prev;
		}
		ListNode cur;
		cur = front.next;
		prev = front;
		while (cur.next != null) {
			if (cur.data == v) {
				prev.next = cur.next;
				return cur;
			} else {
				prev = cur;
				cur = cur.next;
			}
		}

		return null;

	}

// Lab 7B 4
	public ListNode RemoveLast(int v) {
		ListNode prev = this;
		ListNode front = this;
		ListNode x = null;
		ListNode xPrev = null;
		ListNode cur = front.next;
		prev = front;
		if (front == null) {
			return null;
		} else {
			while (cur.next != null) {
				if (cur.data == v) {
					x = cur;
					xPrev = prev;
					cur = cur.next;
				} else {
					prev = cur;
					cur = cur.next;
				}
				if(cur.next == null && cur.data	==v ){
					prev.next = null;
					return cur;
				}
				if(cur.next == null){
					xPrev.next.next = x.next;

				}

			}

		}
		return x;
	}
// Lab 7B 5 *help from a Geek for Geeks video and office hours

	public ListNode reverseThree(int k){
		return reverseThree(this, k);
	}

	public ListNode reverseThree(ListNode node, int k) {
		//ListNode front = node;
		ListNode cur = node;
		ListNode prev = null;
		ListNode child = null; //child is the next node (named child to be less confusing)
		int count = 0;
		//use recursion to reverse all "sublists"
		while(cur != null && count < k) {
			child = cur.next;
			cur.next = prev;
			prev = cur;
			cur = child;
			count++;
		}
		//pointer to (k + 1)th node and then recursively call for the list starting from cur.
		if (child != null)
			node.next = reverseThree(child, k);
		return prev;

	}
}


