public class Doctor extends Role {
	public Doctor() {
		super(1000, 260, 460);
	}
	public void skill(Warrior w) {
		w.setblood(10);
	}
}
