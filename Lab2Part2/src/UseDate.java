
public class UseDate {

    public static void main(String[] args) {

        CS112DateObject day1 = new CS112DateObject("January", 31, 1918, "Gregorian");

        System.out.println("Day 1 original: " + day1);
        System.out.println("Is day1 year a leap year?:" + " " + day1.leapYear()); //test leapyear
        System.out.println("There are " + day1.daysInMonth() + " days in this month.(day1)"); // test days in month
        day1.makeTomorrow();//test moving day forward
        System.out.println("Day 1 next day" + day1);
        // part C



        CS112DateObject day2 = new CS112DateObject("September", 2, 1752, "Gregorian");//new date
        System.out.println("The date is " + day2 +"(day2 original)" );// test setMonth

        System.out.println("Is this year a leap year?(day2):" + " " + day2.leapYear()); //test leapyear
        System.out.println("There are " + day2.daysInMonth() + " days in this month.(day2)"); // test days in month
        day2.makeTomorrow();//test moving day forward
        System.out.println("this is day two test" + day2 + "(day2 next day)");
        day1.makeTomorrow(3);
//        System.out.println(day1);
        CS112DateObject copy = day1.generateCopy();
        System.out.println("Copy of date: " + copy+ "(copy of day1");
        // part d




        System.out.println(day1.getLocation());
        CS112DateObject day3 = new CS112DateObject("January",31, 1918,"Russia");
        day3.setLocation("Russia");
        System.out.println(day3.getLocation());

        CS112DateObject day4 = new CS112DateObject("September",2, 1752,"Scotland");
        day4.setLocation("Scotland");

        System.out.println("Is Russia a leapyear?:(day3)"+ day3.leapYear()  );
        System.out.println("Is Scotland a leapyear?:(day4)"+ day4.leapYear());
        day3.makeTomorrow();
        day4.makeTomorrow();
        System.out.println("Russia next day:(day3) " + day3);
        System.out.println("Scotland next day:(day4) " + day4);

    }

}

