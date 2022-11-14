public class CS112DateObject {

    // These are instance fields - each instance of CS112DateObject has
    // its own set

    private int day;
    private int year;
    private int month; //January = 1

    // you might find this array helpful

    private String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};

    /*
     * Note: You must store the month as an int, and January must be 1
     *
     * JANUARY MUST BE 1. NOT 0
     *
     * If you want to store the String month as well, you must be sure
     * that when the program changes one, it also changes the other.
     * */


    // This is a cosntructor.  It looks like a method,  but it is not.  It has the same name as the class and NO return type. It is
    // used to make an instance of the class.
    //You use it like this:
    //
    //  CS112DateObject date1 = new CS112DateObject("January",4,2022);
    //
    // You cannot do this:
    //
    //  CS112DateObject date1 = new CS112DateObject();
    // because there is no constructor with no arguments.  If there is no construcotr defined in a class, java will set up
    // a no argument constructor by default. If there is a constructor defined, there is no default constructor.
    //
    //

    public CS112DateObject(String m, int d, int y) {
        setDate(m, d, y);
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(String m) {
        month = 1;
    }

    public void setYear(int y) {
        year = y;
    }

    public void setDate(String month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    /*
     * Note: You must store the month as an int, and January must be 1
     *
     * JANUARY MUST BE 1. NOT 0
     *
     * If you want to store the String month as well, you must be sure
     * that when the program changes one, it also changes the other.
     * */

    // This is a constructor.  It looks like a method,  but it is not.  It has the same name as the class and NO return type. It is
    // used to make an instance of the class.
    //You use it like this:
    //
    //  CS112DateObject date1 = new CS112DateObject("January",4,2022);
    //
    // You cannot do this:
    //
    //  CS112DateObject date1 = new CS112DateObject();
    // because there is no constructor with no arguments.  If there is no constructor defined in a class, java will set up
    // a no argument constructor by default. If there is a constructor defined, there is no default constructor.
    //
    //

    public boolean leapYear() {

        return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
    }

    public int daysInMonth() {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (month == 2) {
                return (leapYear()) ? 29 : 28;
            } else {
                return 31;
            }
        }
    }

    //    // Take n as an integer and add days to the calendar
//    // check if over amount of days in month, and if so reset day to 1 then add remainder days
//    // count up months and years
//
    public void makeTomorrow() {
        if (day > daysInMonth()) {
            month++;
            day = 1;
            if (month > 12) {
                year++;
                month = 1;
            } else day = day + 1;
        }

    }

    public void makeTomorrow(int n) {
        for (int i = 0; i < n; i++) {
            makeTomorrow();
        }
    }
    public CS112DateObject generateCopy() {
        return new CS112DateObject(months[month - 1],day,year);
    }
    public boolean sameDate(CS112DateObject someDate) {
        if (this.day == someDate.day && this.month == someDate.month && this.year == someDate.year){
            return true;
        }
        else{
            return false;
        }
    }

    public CS112DateObject generateTomorrow(){
        CS112DateObject copy = generateCopy();
        copy.makeTomorrow();
        return copy;
    }
    public String toString() {
        return month + "," + day + "," + year;
    }
}