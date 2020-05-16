import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		//System.out.println("press startButton");
		System.out.println(e.getActionCommand());
	}
}
