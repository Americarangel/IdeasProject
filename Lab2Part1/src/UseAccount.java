import java.util.Arrays;
public class UseAccount {

	public static void main(String[] args) {
		new UseAccount().go();
	}

	private void go() {
		Account first = new Account("John",1000);
		System.out.println(first);

//		Account second = new Account ("America", 550); // transfers amount from second to first account
//		System.out.println(second);
//		first.transferFrom(second, 550);


		System.out.println(first.getName());
		System.out.println(first.getBalance());
		System.out.println(first.getTransactionCount());

		Account warped = first.warpedCopy();
		Account copies = first.oneCopy(); //
		Account[] many = first.manyCopies(5); // length of array is 5
		System.out.println(warped);
		System.out.println(Arrays.toString(many));

		System.out.println(warped.getName());
		System.out.println(warped.getBalance());
		System.out.println(warped.getTransactionCount());

		
		System.out.println(first);
		System.out.println(warped);
		
		
		warped.transferTo(first, 57);
		
		System.out.println(first);
		System.out.println(warped);

	}

}
