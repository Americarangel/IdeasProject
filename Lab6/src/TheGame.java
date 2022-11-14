

public class TheGame {

	// Notice that the Game does not know about the interface to the game

	private int howManyPushed = 0;
	private int limit;
	private String doneMessage = null;
	private int howMany = 15;
	private int[] badButtons = {1,3,5,9};
	//CHANGES TO THE GAME:
	// howMany was increased from 11 to 15
	// we added two badButtons: 5 and 9
	// theDiamond button was altered so that it is only outlines, and not filled

	public TheGame(int i) {
		limit = i;
	}

	public void pushedBadSpot() {doneMessage = "Player 1 loses, Player 2 you win!";

		if(howManyPushed % 2 == 0){
			System.out.println(doneMessage);}
		else (System.out.println("Player 2 loses, Player 1 you win!");}
		}

	public void pushedGoodSpot() {
		howManyPushed++;
		if (howManyPushed == limit)
			doneMessage = "Curses, you win";
	}

	public boolean isButtonBad(int c) {
		for (int a : badButtons)
			if (c==a) return true;
		return false;
	}

	public String getDoneMessage() {
		return doneMessage;
	}

	public int howManyButtons() {
		return howMany;
	}
}
