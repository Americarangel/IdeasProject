import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BadSpotHandler implements ActionListener {

	private TheGame g;
	private GameFrame frame;
	
	public BadSpotHandler(TheGame game1,GameFrame fr) {
		g = game1;
		frame = fr;
	}

	public void actionPerformed(ActionEvent e) {
		g.pushedBadSpot();
		if (g.getDoneMessage() != null)
			frame.setDoneMessage(g.getDoneMessage());
		frame.repaint();
	}

}
