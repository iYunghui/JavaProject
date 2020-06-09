package Tzu;

public class Warrior extends Role {

	public Warrior() {
		super(1000, 560, 260);
	}
	public int skill_one(int towerblood) {
		if(pos_x > tower_x - 100 && pos_x < tower_x + 350)
		 	return towerblood - 5;
		else if(pos_y > tower_y - 100 && pos_y < tower_y + 200)
		 	return towerblood - 5;
		return towerblood;
	}
	public int skill_two(int towerblood) {
		if(pos_x > tower_x - 100 && pos_x < tower_x + 350)
		 	return towerblood - 20;
		else if(pos_y > tower_y - 100 && pos_y < tower_y + 200)
		 	return towerblood - 20;
		return towerblood;
	}
	public int skill_three(int towerblood) {
		int random = (int) (Math.random()*10);
		if(random < 5)
			return towerblood - 50;
		else
			return towerblood - 100;
	}
	public void move(int x, int y) {
		if(pos_x + x > 0 && pos_x + x < 1080)
			setposx(x);
		if(pos_y + y > 0 && pos_y + x < 720)
			setposy(y);
	}
	public void setposx(int change) {
		pos_x = pos_x + change;
	}
	public void setposy(int change) {
		pos_y = pos_y + change;
	}
}
