
public class Account {


	private int balance;
	private String name;
	private int transactionCount;

	//If you System.out.print(ln) a Date, this method is called.
	//
	public String toString() {
		return "Account: " + name + " Balance: " + (balance) + " Transaction Count: " + (transactionCount);
	}

	public Account(String n, int b) {
		balance = b;
		name = n;
		transactionCount = 0;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int b) {
		balance = b;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public void deposit(int b) { // takes int as an argument, adds that to the balance, adds one to transactionCount
		balance = balance + b;
		transactionCount = transactionCount + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public boolean isSame(Account other) {
		if (balance != other.balance)
			return false;
		if (!name.equals(other.name))
			return false;
		return true;
	}

	public void transferTo(Account fromHere, int amount) {
		balance = balance + amount;
		fromHere.balance = fromHere.balance - amount;
		transactionCount = transactionCount + 1;
		fromHere.transactionCount = fromHere.transactionCount + 1;
		//this line says TC = TC +1 and then adds another plus 1,
		//which means that each time the method is called, there are two TCs.
		System.out.println("fromhere: " + fromHere);
	}

	public void transferFrom(Account toHere, int amount) {
		toHere.transferTo(this, amount);
	}
	//this = the thing before the period

	public Account warpedCopy() {
		Account toReturn;
		if (balance > 1000)
			toReturn = new Account(name + " zombie", (int) (balance * 1.1));
		else
			toReturn = new Account(name + " zombie", (int) (balance * 0.5));
		toReturn.transactionCount = 117;
		return toReturn;
	}

	public Account oneCopy() {
		Account one = new Account(name, balance);
		one.transactionCount = 0;
		return one;
	}

	public Account[] manyCopies(int count) { //array with number of copies (5)
		Account[] copies = new Account[count];
		for (int i = 0; i < count; i++) {
			copies[i] = oneCopy(); // initialize
		}
		return copies;
	}
}
