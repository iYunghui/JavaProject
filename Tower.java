public class Tower {

	private int blood = 1000;
	private int position_x;
	private int position_y;
	private int role_x = 0;
	private int role_y = 0;
	
	public Tower() {
		blood = 1500;
		position_x = 200;
		position_y = 250;
	}
	
	public int attack(int z, Role ro) {
		int r = 0;
		int x = ro.getposx();
		int y = ro.getposy();
		if(z==1 && x<=role_x+5 && x>=role_x-5 && y<=role_y+5 && y>=role_y-5) {
			role_x = x;
			role_y = y;
			r = 10;
		}
		else if(z==2) {
			r = 10;
		}
		else {
			role_x = x;
			role_y = y;
			r = 0;
		}
		ro.setblood(-r);
		return r;
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
	
	public void setblood(int change) {
		blood = blood + change;
	}
}
