public class Test {
    public static void main(String[] args) {

        //**** Areas commented out are so that we could focus on the makeTomorrow****//
    CS112DateObject day1 = new CS112DateObject("January", 31, 1918, "Gregorian");

        System.out.println("The date is " + day1);
//        System.out.println("Is this year a leap year?:" + " " + day1.leapYear()); //test leapyear
//        System.out.println("There are " + day1.daysInMonth() + " days in this month."); // test days in month
        day1.makeTomorrow();//test moving day forward
    // part C
    CS112DateObject day2 = new CS112DateObject("September", 2, 1752, "Gregorian");
        System.out.println("The date is " + day2);// test setMonth
//        System.out.println("Is this year a leap year?:" + " " + day2.leapYear()); //test leapyear
//        System.out.println("There are " + day2.daysInMonth() + " days in this month."); // test days in month
        day2.makeTomorrow();//test moving day forward
        day1.makeTomorrow(3);
        System.out.println(day2);
        System.out.println(day1);
    //        System.out.println(day1);
//    CS112DateObject copy = day1.generateCopy();
//        System.out.println("Copy of date: " + copy);
    // part d
//        System.out.println(day1.getLocation());
    CS112DateObject day3 = new CS112DateObject("December",31, 1451,"Russia");
//        day3.setLocation("Russia");
//        System.out.println(day2.getLocation());

    CS112DateObject day4 = new CS112DateObject("December",31, 1604,"Scotland");
//        day4.setLocation("Scotland");
        System.out.println("Is Russia a leapyear?:"+ day3.leapYear()  );
        System.out.println("Is Scotland a leapyear?:"+ day4.leapYear());
        day3.makeTomorrow(5);
        day4.makeTomorrow();
        System.out.println("Russia next day: " + day3);
        System.out.println("Scotland next day: " + day4);

}

}

