
public class Tester {

	public static void main(String[] args) {
		
		LinkedIntList test = new LinkedIntList();
		LinkedIntList test2 = new LinkedIntList();
		test.add(1);
		test.add(11);
		test.add(19);
		test.add(12);
		test.add(19);
		test.add(19);
		test.add(20);
		test.add(19);

		test2 = test;

		System.out.println(test);
		test.RemoveLast(19);
		System.out.println("RemoveLast: " + test);

		test.RemoveFirst(19);
		System.out.println("RemoveFirst: " + test);

		test = new LinkedIntList();

		for (int i=1;i<=12;i++)
			test.add(i);
	
		System.out.println(test);

		test.hasConsecutive();
		System.out.println("hasConsecutive:" + test);

		test2.expand(2); // n=2 for two copies/numbers
		System.out.println("Expand: " + test2);

		test.reverseThree(3);
		System.out.println("Reverse Three:" + test);

	}

}
