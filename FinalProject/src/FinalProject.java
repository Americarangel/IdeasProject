// get user input on what state they are currently in and how many miles they think they will
// travel in order to get an estimate on how much gas money they will need for that state.
import java.util.Scanner;
public class FinalProject {

    private final double[] cPrices = {5.853,6.514}; // values in the array that represent diesel and gas price
    private final double[] oPrices = {4.878,5.632};
    private final double[] wPrices = {4.906,5.727};
    private final String[] states = {"California", "Oregon", "Washington"}; // creates an array "states" with three strings in it

    public static void main(String[] args){ //
        FinalProject fp = new FinalProject(); // creates new class
        String state = ""; // declares state as an empty string for later use
        boolean checkLocation = false; // if the location is not valid
            while (!checkLocation){
                state = fp.getLocation(); //get location returns string location stored in state
                checkLocation = fp.isCorrectLocation(state);//correct location returns true false based
                // on if inputted location matches with string array
            }
        double miles = fp.getMiles();
        double mpg = fp.getMPG();
        double price =fp.getPrice(miles, state, mpg);

        System.out.println("The total estimated cost of your trip is " +  price);
    }

    public String getLocation(){
        Scanner sc = new Scanner(System.in); //user input to declare state
        System.out.println("Hello, I will help you with an estimate on gas spending." +
                " What state are you driving through next?");
        for (String state : states) { // refers to private array
            System.out.print(state + " ");//prints state with a space after
        }
        String passState = sc.nextLine();
        passState = passState.toLowerCase();

        return passState;

    }

    public boolean isCorrectLocation(String passState){
        for (String state : states) {
            if (state.toLowerCase().equals(passState)) { //verifies that a state given by user is one of the three object states in the array
                System.out.println("This is a valid state");
                return true;
            }
        }
        System.out.println("not valid state"); //lets the user know if the state is not valid
        return false;
    }

    public double getMiles(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many miles are you driving through this state?"); //user puts how many miles they are planning to travel through that state
        return sc.nextDouble();
    }

    public double getMPG(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many miles per gallon does your car get?"); // car information for calculations
        return sc.nextDouble();
    }

    public double getPrice(double miles, String s, double mpg){
        String gasType = "";
        System.out.println("Does your car run \n A. Diesel \nor \n B. Regular?"); // gets gas info from user
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        if(type.equals("A")){ //gas options
            gasType = "Diesel";
        }if(type.equals("B")){
            gasType = "Regular";
        }

        if(states[0].toLowerCase().equals(s)){ //instances depending on which gas prices and what states the user finds themselves in

            if(gasType.equals("Diesel")){

                return Math.round((miles/mpg) * cPrices[1]);
            }
            if(gasType.equals("Regular")){
                return Math.round((miles/mpg) * cPrices[0]);
            }
            //calculations for California

        }else if(states[1].toLowerCase().equals(s)){

            if(gasType.equals("Diesel")){
                return Math.round((miles/mpg) * oPrices[1]);
            }
            if(gasType.equals("Regular")){
                return Math.round((miles/mpg) * oPrices[0]);
            }
            //calculations for Oregon
        }else{

            if(gasType.equals("Diesel")){
                return Math.round((miles/mpg)* wPrices[1]);

            }
            if(gasType.equals("Regular")){
                return Math.round((miles/mpg) * wPrices[0]);
            }//calculations for Washington
        }//else statement
        return 0;
    }//get gallons

}
