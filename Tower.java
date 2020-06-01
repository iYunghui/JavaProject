import java.util.Timer;
import java.util.TimerTask;

public class Tower {

	private int blood = 1500;
	private int position_x;
	private int position_y;
	private int cha_x;
	private int cha_y;
	
	public void setblood(int attack) {
		if (attack == 1)
			blood = blood - 5;
		else if (attack == 2) {
			blood = blood - 10;
			blood = blood - 10;
		}
		else if (attack == 3)
			blood = blood - 50;
		else if (attack == 4)
			blood = blood - 100;
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
	
	/*
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		public boolean attack() {
			return true;
		}
	};
		
	timer.schedule(task, 1000, 1000);
	*/
	
	public boolean attack() {
		//delay 1s
		return true;
	}
}

