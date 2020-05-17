import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame{
	
	Tower tower = new Tower();
	Role role = new Role();

	private int tower_x = 100;      // tower_x = role.getposx();
	private int tower_y = 50;       // tower_y = role.getposy();
	private int tower_blood = 1500; // tower_blood = role.getblood();
	
	private int role_x = 0;         // tower_blood = role.getposx();
	private int role_y = 300;       // tower_blood = role.getposy();
	private int role_blood = 1500;  // tower_blood = role.getblood();
	
	private int tower_damage = 0;
	private int role_damage = 0;
	
	private Boolean isStart = false;
	JButton start, Skill_1, Skill_2, Skill_3;
	JLabel text;
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}
	
	public MyFrame() {
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		initialize();
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		// temp background
		Image backgroundImage = Toolkit.getDefaultToolkit().getImage("background.png");
		g.drawImage(backgroundImage, 0, 0, 1080, 720, this);
		// temp tower
		Image towerImage = Toolkit.getDefaultToolkit().getImage("tower.png");
		g.drawImage(towerImage, tower_x, tower_y, 350, 350, this);
		// temp role
		Image roleImage = Toolkit.getDefaultToolkit().getImage("role.png");
		g.drawImage(roleImage, role_x, role_y, 1500, 1000, this);
		
		// tower blood
		g.setColor(Color.RED);
		g.drawRect(tower_x+110, tower_y+350, 100, 10);
		g.fillRect(tower_x+110, tower_y+350, 100-tower_damage/15, 10);
		
		// role blood
		g.setColor(Color.RED);
		g.drawRect(role_x+350, role_y+300, 100, 10);
		g.fillRect(role_x+350, role_y+300, 100-role_damage/10, 10);
		
	}
	
	public void initialize() {
		start = new JButton("Start");
		ButtonListener startlistener = new ButtonListener();
		start.addActionListener(startlistener);
		start.setLocation(1100, 40);
		start.setSize(120, 30);
		add(start);
		
		text = new JLabel("");
		text.setLocation(1100, 100);
		text.setSize(120, 30);
		
		Skill_1 = new JButton("Skill 1");
		ButtonListener skill1listener = new ButtonListener();
		Skill_1.addActionListener(skill1listener);
		Skill_1.setLocation(850, 570);
		Skill_1.setSize(80, 80);
		add(Skill_1);
		
		Skill_2 = new JButton("Skill 2");
		ButtonListener skill2listener = new ButtonListener();
		Skill_2.addActionListener(skill2listener);
		Skill_2.setLocation(970, 570);
		Skill_2.setSize(80, 80);
		add(Skill_2);
		
		Skill_3 = new JButton("Skill 3");
		ButtonListener skill3listener = new ButtonListener();
		Skill_3.addActionListener(skill3listener);
		Skill_3.setLocation(970, 470);
		Skill_3.setSize(80, 80);
		add(Skill_3);
	}
	
	public void judge() {
		if(tower_blood == 0) {
			System.out.println("lose game");
			text.setText("lose game");
			isStart = false;
			// stop everything
		}
		else if(role_blood == 0) {
			System.out.println("win game");
			text.setText("win game");
			isStart = false;
			// stop everything
		}
		else {
			
		}
	}
	
	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			System.out.println(button);
			if(button.equals("Start")) {
				isStart = true;
			}
			else if(button.equals("Skill 1")) {
				
			}
			else if(button.equals("Skill 2")) {
				
			}
			else if(button.equals("Skill 3")) {
				
			}
		}
	}
}
