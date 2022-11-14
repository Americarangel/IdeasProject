import java.util.Scanner;

public class TestDate {

    public static void main(String[] args) {
		
	new TestDate().go();

    }

    private void go() {
	String tests = "January 31 2001 Gregorian " +
	    "February 28 2000 Gregorian " +
	    "February 29 2000 Gregorian " +
	    "February 28 1999 Gregorian " +
	    "February 29 1999 Scotland " +
	    "March 31 1988 Russia " +
	    "April 30 2103 Russia " +
	    "May 15 1599 Russia " +
	    "June 12 1600 Scotland " +
	    "December 31 1642 Scotland " +
	    "December 13 2001 Russia ";
		
	Scanner sc = new Scanner(tests);
		
	DateFactory df = new DateFactory();

//	GregorianDate j = df.createDate("February", 28, 1798, "Russia");
//	df.createDate("February", 28, 1798, "Russia"); //make array string in the test and call it piece by piece
//		System.out.println(j);

	while (sc.hasNext()) {
		String month = sc.next();
		int day = sc.nextInt();
		int year = sc.nextInt();
		String location = sc.next();

		GregorianDate i = df.createDate(month, day, year, location);
		System.out.println();
		System.out.println(i);
		i.makeTomorrow();
		System.out.println(i);

		}
    }
}

