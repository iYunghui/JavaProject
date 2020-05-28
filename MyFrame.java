import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class MyFrame extends JFrame{
	
	private static String button = new String("");
	private static int count = 0;
	
	Tower tower = new Tower();
	Role role = new Role();

	private int tower_x = 200;      // tower_x = role.getposx();
	private int tower_y = 250;       // tower_y = role.getposy();
	private int tower_blood = 1500; // tower_blood = role.getblood();
	
	private int role_x = 560;         // tower_blood = role.getposx();
	private int role_y = 260;       // tower_blood = role.getposy();
	private int role_blood = 1000;  // tower_blood = role.getblood();
	
	private int tower_damage = 0;
	private int role_damage = 0;
	
	private static Boolean isStart = false;
	private static JButton start, Skill_1, Skill_2, Skill_3;
	JLabel text;
	
	
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
		Timer timer = new Timer();
		TimerTask timetask = new TimerTask() {
			@Override
			public void run() {
				count++;
				if(!Skill_1.isEnabled() && count>5) {
					Skill_1.setEnabled(true);
				}
				else if(!Skill_2.isEnabled() && count>5) {
					Skill_2.setEnabled(true);
				}
				else if(!Skill_3.isEnabled() && count>5) {
					Skill_3.setEnabled(true);
				}
				frame.re();
	        }
		};
		timer.schedule(timetask, 0, 1000);
	}
	
	public MyFrame() {
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		initialize();
	}
	
	public void re() {
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		// temp background
		Image backgroundImage = Toolkit.getDefaultToolkit().getImage("background.jpg");
		g.drawImage(backgroundImage, 0, 0, 1080, 720, this);
		// temp tower
		Image towerImage = Toolkit.getDefaultToolkit().getImage("tower.png");
		g.drawImage(towerImage, tower_x, tower_y, 250, 150, this);
		// temp role
		Image roleImage = Toolkit.getDefaultToolkit().getImage("role.png");
		g.drawImage(roleImage, role_x, role_y, 100, 180, this);
		
		// tower blood
		g.setColor(Color.RED);
		g.drawRect(tower_x+70, tower_y+160, 100, 8);
		g.fillRect(tower_x+70, tower_y+160, tower_blood/15, 8);
		
		// role blood
		g.setColor(Color.RED);
		g.drawRect(role_x+10, role_y+180, 100, 8);
		g.fillRect(role_x+10, role_y+180, role_blood/10, 8);
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
		Skill_1.setLocation(1100, 370);
		Skill_1.setSize(120, 80);
		add(Skill_1);
		
		Skill_2 = new JButton("Skill 2");
		ButtonListener skill2listener = new ButtonListener();
		Skill_2.addActionListener(skill2listener);
		Skill_2.setLocation(1100, 470);
		Skill_2.setSize(120, 80);
		add(Skill_2);
		
		Skill_3 = new JButton("Skill 3");
		ButtonListener skill3listener = new ButtonListener();
		Skill_3.addActionListener(skill3listener);
		Skill_3.setLocation(1100, 570);
		Skill_3.setSize(120, 80);
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
	
	public static class ButtonListener implements ActionListener{
		
		public String getButtonString() {
			return button;
		}
		public void actionPerformed(ActionEvent e) {
			button = e.getActionCommand();
			System.out.println(button);
			if(button.equals("Start")) {
				isStart = true;
			}
			else if(button.equals("Skill 1")) {
				count = 0;
				Skill_1.setEnabled(false);
			}
			else if(button.equals("Skill 2")) {
				count = 0;
				Skill_2.setEnabled(false);
			}
			else if(button.equals("Skill 3")) {
				count = 0;
				Skill_3.setEnabled(false);
			}
		}
	}

}
