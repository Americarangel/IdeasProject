
public class RussiaDate extends GregorianDate {

    public RussiaDate(String month, int day, int year) throws AmeException {

        super(month, day, year);
    }

    public boolean isLeap() {
        if(getYear() < 1918 && (getYear()%4 ==0)){
            return true;
        }else return getYear() > 1918 && (getYear()%400 ==0 || (getYear()%100!=0 && getYear()%4 ==0));
    }


    public boolean isLastDay() {
        if (this.getYear() < 1491 && this.getMonth()==2 && this.getDay()==28)
            return true;
        else if (getYear() >= 1491 && getYear() < 1699 && getMonth() == 8 && getDay() == 31) {
            return true;
        } else return (getYear() >= 1699 && getMonth() == 12 && getDay() == 31);
    }

    public boolean isChangedForSpecialDay() {

        if (this.getMonth() == 1 && this.getDay() == 31 && this.getYear() == 1918) {
            this.setDay(14);
            this.setMonth(String.valueOf(2)); // does not work with just (2) because 2 is set as a string
            return true;
        }
        return false;
    }
}

