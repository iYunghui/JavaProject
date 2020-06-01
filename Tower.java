import java.util.Timer;
import java.util.TimerTask;

public class Tower {

	private int blood = 1500;
	private int position_x;
	private int position_y;
	private int cha_x;
	private int cha_y;
	
	public void setblood() {
		blood = blood - 10;
	}
	
	public int getblood() {
		return blood;
	}
	
	public void setposition(int x, int y) {
		position_x = x;
		position_y = y;
	}
	
	public int getposition_x() {
		return position_x;
	}
	
	public int getposition_y() {
		return position_y;
	}
}

