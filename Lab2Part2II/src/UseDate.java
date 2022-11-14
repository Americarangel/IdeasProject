public class UseDate {

    public static void main(String[] args) {
        CS112DateObject day1 = new CS112DateObject("January", 31, 1918);

        System.out.println("The day is " + day1);// test setMonth
        System.out.println("This year is a leap year?:" + " " + day1.leapYear()); //test leapyear
        System.out.println("There are " + day1.daysInMonth() + " Days in this month"); // test days in month
        day1.makeTomorrow();//test moving day forward
        // part C
        day1.makeTomorrow(3);
        System.out.println(day1);
        CS112DateObject copy = day1.generateCopy();
        System.out.println("Copy of date: " + copy);
    }
}
