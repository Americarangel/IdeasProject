
public class ScotlandDate extends GregorianDate {

    public ScotlandDate(String month, int day, int year) throws  AmeException{
        super(month, day, year);
    }

    public boolean isLeap() {
        if (this.getYear() < 1752 && this.getYear() > 1599) {
            return (this.getYear() % 4 == 0);
        } else if (this.getYear() < 1600) {
            int previousLeapYear = this.getYear() + 1;
            return (previousLeapYear % 4 == 0);
        } else if (this.getYear() >= 1752) {
            return (this.getYear()%400 ==0 || (this.getYear()%100!=0 && this.getYear()%4 ==0));
        } else return false;
    }

    public boolean isLastDay() {
        if(this.getYear() <1600 && this.getMonth()==3 && this.getDay()==24 ){
            return true;
        }else return getYear() > 1600 && getMonth() == 12 && getDay() == 31;
    }

    public boolean isChangedForSpecialDay() {
        if (this.getMonth() == 9 && this.getDay() == 2 && this.getYear() == 1752) {
            this.setDay(15);
            return true;
        }
        return false;
    }

}
