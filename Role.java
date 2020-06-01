import java.util.*;
import java.math.*;
public class Role {
	private int blood;
	private int pos_x, pos_y;
	private long skill2time = 0;
	private long skill3time = 0;
	private int tower_x = 200;
	private int tower_y = 250;
	
	public int skill_one(int towerblood) {
		if(pos_x > tower_x && pos_x < tower_x + 250)
		 	return towerblood - 5;
		else if(pos_y > tower_y && pos_y < tower_y + 150)
		 	return towerblood - 5;
		return towerblood;
	}
	public int skill_two(int towerblood) {
		if(pos_x < tower_x || pos_x > tower_x + 250)
		 	return towerblood;
		else if(pos_y < tower_y || pos_y > tower_y + 150)
		 	return towerblood;
		else if(skill2time == 0 || current - skill2time >= 15000) {
			skill2time = current;
			return towerblood - 10;
		}
		else 
			return towerblood;
	}
	public int skill_three(int towerblood) {
		long current = System.currentTimeMillis( );
		if(skill3time == 0 || current - skill3time >= 15000) {
			skill3time = current;
			int random = (int) (Math.random()*10);
			if(random < 5)
				return towerblood - 50;
			else
				return towerblood - 100;
		}
		else
			return towerblood;
	}
	public void move(int x, int y) {
		if(pos_x + x > 0 && pos_x + x < 1080)
			setposx(x);
		if(pos_y + y > 0 && pos_y + x < 720)
			setposy(y);
	}
	public Role() {
		blood = 1500;
		pos_x = 0;
		pos_y = 300;
	}
	public int getblood() {
		return blood;
	}
	public int getposx() {
		return pos_x;
	}
	public int getposy() {
		return pos_y;
	}
	public void setblood(int change) {
		blood = blood + change;
	}
	public void setposx(int change) {
		pos_x = pos_x + change;
	}
	public void setposy(int change) {
		pos_y = pos_y + change;
	}
}

